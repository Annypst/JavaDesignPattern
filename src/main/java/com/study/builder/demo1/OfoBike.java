package main.java.com.study.builder.demo1;

public class OfoBike extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("A ofoBike frame have been produced.");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("A ofoBike seat has been produced.");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
