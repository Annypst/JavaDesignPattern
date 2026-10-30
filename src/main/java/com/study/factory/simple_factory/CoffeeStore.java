package main.java.com.study.factory.simple_factory;

public class CoffeeStore {
    public Coffee order(String type) {

        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();

        Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
