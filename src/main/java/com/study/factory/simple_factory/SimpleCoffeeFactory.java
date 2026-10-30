package main.java.com.study.factory.simple_factory;

public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new American();
        } else if("latte".equals(type)) {
            coffee = new Latte();
        }
        return coffee;
    }
}