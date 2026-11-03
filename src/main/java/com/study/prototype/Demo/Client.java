package main.java.com.study.prototype.Demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype   realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();

        System.out.println(clone == realizetype);
    }


}
