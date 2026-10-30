package main.java.com.study.command;

public class Client {



    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setTable(1);
        order1.setFood("西红柿炒鸡蛋",2);
        order1.setFood("可乐",1);

        Order order2 = new Order();
        order2.setTable(2);
        order2.setFood("牛肉面",1);
        order2.setFood("橙汁",3);

        SeniorChef receiver = new SeniorChef();
        OrderCommand cmd1 = new OrderCommand(receiver,order1);
        OrderCommand cmd2 = new OrderCommand(receiver,order2);

        Waiter invoke = new Waiter();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);

        invoke.orderUp();
    }
}
