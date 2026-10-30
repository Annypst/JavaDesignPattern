package main.java.com.study.static_proxy;

public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("Some service fee!");
        trainStation.sell();
    }
}
