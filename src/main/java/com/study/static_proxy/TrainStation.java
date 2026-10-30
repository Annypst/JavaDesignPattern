package main.java.com.study.static_proxy;

public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("Sold by Station!");
    }
}
