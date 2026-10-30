package main.java.com.study.factory.factory_method;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
