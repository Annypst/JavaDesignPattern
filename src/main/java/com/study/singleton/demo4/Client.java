package main.java.com.study.singleton.demo4;

import main.java.com.study.singleton.demo3.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton instance =Singleton.getInstance();
       Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}
