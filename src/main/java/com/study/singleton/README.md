# 单例模式（Singleton Pattern）期末复习笔记

---

## 📌 一、核心定义（一句话考点）
> **定义**：确保某一个类**只有一个实例**，而且**自行实例化**并**向整个系统提供这个实例**，这个类称为单例类，它提供全局访问的方法。
>
> 💡 **核心地位**：**GoF 23 种设计模式之一**（**对象创建型**模式，重要程度：★★★★☆）。
> - **三大核心要点（必背）**：
>   1. 某个类只能有一个实例；
>   2. 必须**自行创建**这个实例（构造函数私有化）；
>   3. 必须**自行向整个系统提供**这个实例（公共静态方法）。

---

## 🎯 二、单例类的核心代码三要素（期末填空/代码题必考）

无论哪种写法，都必须具备以下三样东西：
1. **私有构造方法**：`private Singleton() {}` —— 防止外部随意 `new`；
2. **静态私有自身引用**：`private static Singleton instance;` —— 保存唯一实例；
3. **公有静态访问点**：`public static Singleton getInstance()` —— 供全局统一获取。

---

## 💡 三、五种实现方案全景对比（Demo1 ~ Demo5）

| 实现方式 | 工程目录 | 实例化时机 | 线程安全 | 性能与资源 | 优缺点与考点 |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **饿汉式 (静态变量)** | [`demo1`](demo1/Singleton.java) | **类加载时** | ✅ 极安全 (JVM类加载保证) | 耗内存 (未调用即创建) | 写法简单；若类从未使用会导致内存浪费。 |
| **饿汉式 (静态代码块)**| [`demo2`](demo2/Singleton.java) | **类加载时** | ✅ 极安全 | 耗内存 | 与 demo1 本质相同，适合在静态代码块中编写复杂初始化逻辑。 |
| **懒汉式 (线程不安全)**| [`demo3`](demo3/Singleton.java) | **首次调用 `getInstance()`** | ❌ **不安全** | 省内存 | 实现了延迟加载 (Lazy Loading)；但多线程并发时会产生多个对象。 |
| **双重检查锁定 (DCL)** | [`demo4`](demo4/Singleton.java) | **首次调用 `getInstance()`** | ✅ 安全 (需配 `volatile`) | 性能高 (仅首次加锁) | 兼顾线程安全与性能；**面试/考试高频大题：必须加 `volatile`**。 |
| **静态内部类 (IoDH)** | [`demo5`](demo5/Singleton.java) | **首次调用 `getInstance()`** | ✅ 极安全 (JVM内部类加载保证) | 最完美方案 | **推荐写法**！利用 JVM 类加载机制实现无锁并发延迟加载。 |

---

## ❓ 四、三大灵魂疑惑深度剖析（期末大题拿分关键）

### Q1：饿汉和懒汉的创建时机到底怎么体现的？为什么平时看不出来？
**答题核心要点**：
平时看不出来，是因为你在客户端里直接调了 `getInstance()`，两者在这个时间点都创建了对象。
要真正看到区别，做这个**思维实验**：

```java
// 假设我们在类里加一个完全无关的静态方法：
public static void otherMethod() { System.out.println("调用了无关方法"); }
```

1. **饿汉式（迫不及待）**：
   - 只要有任何地方访问了 `Singleton.otherMethod()`，JVM 就会**加载该类**；
   - 在**类加载阶段**，静态变量 `instance = new Singleton()` 会被**立刻执行**！
   - **结果**：你明明从没调过 `getInstance()`，构造方法却已经被偷偷执行了，对象提前占用了内存（这就是“饿”）。
2. **懒汉式（不见兔子不撒鹰）**：
   - 调用 `Singleton.otherMethod()` 只会加载类，`instance` 依然是 `null`；
   - 只有代码真正第一次调用 `Singleton.getInstance()` 时，才会触发 `new Singleton()`。

---

### Q2：双重检查锁定（DCL）中，另一个关键字 `volatile` 到底是干嘛的？
看 [`demo4`](demo4/Singleton.java) 中的核心代码：
```java
if (instance == null) {                         // 第一次检查：避免无谓加锁
    synchronized (Singleton.class) {
        if (instance == null) {                 // 第二次检查：防止并发重复创建
            instance = new Singleton();         // ⚠️ 隐患所在！
        }
    }
}
```

#### 为什么必须加上 `volatile`（即 `private static volatile Singleton instance;`）？
因为 `instance = new Singleton();` 在 JVM 底层并不是原子操作，它包含 **3 步指令**：
1. `memory = allocate();` —— 分配对象的内存空间；
2. `ctorInstance(memory);` —— 执行构造方法，初始化对象；
3. `instance = memory;` —— 将引用变量指向这块内存（此时 `instance != null` 了）。

#### 💥 指令重排引发的灾难：
编译器和 CPU 为了性能，会进行**指令重排序优化**，可能会把顺序优化颠倒成 **1 $\rightarrow$ 3 $\rightarrow$ 2**！
- 线程 A 执行到了第 3 步（刚把引用连上，但**第 2 步构造函数还没跑完，对象是个残缺半成品**）；
- 恰在此时，线程 B 进入了 `getInstance()`；
- 线程 B 执行最外层的 `if (instance == null)`，发现 `instance != null`，**欣喜若狂地直接 return 拿走了这个未初始化完成的半成品对象**！
- 线程 B 拿去调用业务方法，瞬间抛出诡异异常或数据错乱崩溃！

👉 **`volatile` 关键字的两大神效**：
1. **禁止指令重排序（内存屏障）**：强制保证 1 $\rightarrow$ 2 $\rightarrow$ 3 的执行顺序，绝不颠倒；
2. **保证内存可见性**：任何线程修改了值，立即同步回主内存，其他线程立即可见。

---

### Q3：期末考试范围判定：反射/序列化破坏单例需要背吗？
**结论**：**期末考试 100% 以你课件 PPT 为准，完全不需要背！**

- **课件 PPT 审查结果**：
  - PPT 中关于单例的全部篇幅都在讲解：**饿汉式、懒汉式、`synchronized` 性能损耗、DCL 双重检查锁定、`volatile` 内存模型机制、以及静态内部类（IoDH）**；
  - 没有任何一页 PPT 涉及“反射破坏单例”或“序列化 `readResolve()` 破解”。
- **常识性了解（面试加分项，1句话记住）**：
  - **反射破坏**：通过 `setAccessible(true)` 强行调用私有构造方法 `new` 出来（防御方法：在私有构造方法里加判断抛异常）；
  - **序列化破坏**：反序列化默认走二进制重新拼对象（防御方法：类里写 `private Object readResolve() { return instance; }`，直接返回已有的单例）；
  - **最安全的单例**：使用 **枚举（`enum`）**，JVM 底层从语法层面天生禁止反射和序列化破坏单例！

---

## ☕ 五、JDK 源码经典应用（期末必考案例）

### `java.lang.Runtime`（PPT Slide 36 教科书级饿汉式单例）
在每一个 Java 应用程序中，都有唯一的一个 `Runtime` 运行环境对象：
```java
public class Runtime {
    // 1. 静态私有自身实例（饿汉式）
    private static Runtime currentRuntime = new Runtime();

    // 2. 公共静态全局访问点
    public static Runtime getRuntime() {
        return currentRuntime;
    }

    // 3. 私有构造方法
    private Runtime() {}
}
```
调用方式：`Runtime runtime = Runtime.getRuntime();`
