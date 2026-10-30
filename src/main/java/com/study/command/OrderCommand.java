package main.java.com.study.command;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command {
    //持有接收者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTable()+" : ");
        Map<String, Integer> m1 = order.getFood();
        Set<String> keys = m1.keySet();
        for (String foodName : keys) {
            receiver.cookFood(foodName,m1.get(foodName));
        }

        System.out.println(order.getTable() + "的饭准备完毕");
    }
}
