package main.java.com.study.strategy;

public class Client {
    public static void main(String[] args) {
        //A
        Salesman salesman = new Salesman(new StrategyA());
        salesman.showToClient();

        //B
        Salesman salesman1 = new Salesman(new StrategyB());
        salesman1.showToClient();

        //C
        Salesman salesman2 = new Salesman(new StrategyC());
        salesman2.showToClient();
    }
}
