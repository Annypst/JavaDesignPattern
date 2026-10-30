package main.java.com.study.factory.abstract_factory;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
