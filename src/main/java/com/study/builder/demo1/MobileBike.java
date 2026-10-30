package main.java.com.study.builder.demo1;

public class MobileBike extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("A mobileBike frame have been produced.");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("A mobileBike seat has been produced.");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
