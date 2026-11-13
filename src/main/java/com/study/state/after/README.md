# 状态模式（State Pattern）期末复习笔记

> 💡 本目录为状态模式重构后的完整实现，详细的期末复习笔记、前后重构对比（before vs after）、核心角色、类图及常考题型请直接参阅：
> 👉 **[状态模式根目录复习笔记 (`../README.md`)](../README.md)**

---

### 本目录文件结构清单：
- [`LiftState.java`](LiftState.java)：抽象状态类（持有关联的 `Context` 引用）
- [`Context.java`](Context.java)：环境类（维持当前状态及全局预加载的静态状态单例）
- [`ClosingState.java`](ClosingState.java)：具体状态——关门状态
- [`OpeningState.java`](OpeningState.java)：具体状态——开门状态
- [`RunningState.java`](RunningState.java)：具体状态——运行状态
- [`StoppingState.java`](StoppingState.java)：具体状态——停止状态
- [`Client.java`](Client.java)：测试客户端
