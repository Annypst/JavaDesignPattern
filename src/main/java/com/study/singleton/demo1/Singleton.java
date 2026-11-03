package main.java.com.study.singleton.demo1;
//饿汉式 静态成员变量
public class Singleton {
    private Singleton() {

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
