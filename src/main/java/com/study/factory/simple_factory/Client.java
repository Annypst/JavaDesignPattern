package main.java.com.study.factory.simple_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee co = coffeeStore.order("latte");
        System.out.println(co.getName());

    }
}
