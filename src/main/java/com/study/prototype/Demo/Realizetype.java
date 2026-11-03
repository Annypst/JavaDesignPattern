package main.java.com.study.prototype.Demo;

public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("具体原型创建完成，无参构造被调用");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
