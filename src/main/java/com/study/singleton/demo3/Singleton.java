package main.java.com.study.singleton.demo3;
//懒汉式：线程不安全
public class Singleton {
    private Singleton() {}

    private  static Singleton instance;

    public  static Singleton getInstance() { //加synchronized会安全
        if(instance== null) {
            instance = new Singleton();
        }

        return  instance;
    }
}
