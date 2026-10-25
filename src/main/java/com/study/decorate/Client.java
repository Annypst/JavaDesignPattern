package main.java.com.study.decorate;

public class Client {

    public static void main(String[] args) {

        FastFood f1 = new FriedRice();

        System.out.println(f1.getDescription()+f1.cost());

        f1 = new Egg(f1);

        System.out.println(f1.getDescription()+f1.cost());

    }

}
