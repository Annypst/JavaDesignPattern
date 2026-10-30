package main.java.com.study.factory.factory_method;

public class AmercianCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        //produce a new American
        return new American();
    }
}
