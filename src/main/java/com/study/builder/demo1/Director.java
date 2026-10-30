package main.java.com.study.builder.demo1;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;

    }

    //组装自行车的方法
    public Bike constructor() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
