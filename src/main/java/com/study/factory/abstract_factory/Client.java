package main.java.com.study.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee co = factory.createCoffee();
        Dessert de = factory.createDessert();
        de.show();
        System.out.println(co.getName());


    }
}
