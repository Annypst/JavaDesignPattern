package main.java.com.study.factory.abstract_factory;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new American();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
