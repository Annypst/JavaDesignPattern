package main.java.com.study.decorate;

public class FriedNoodles extends FastFood {

    public FriedNoodles() {

        super(12,"The price of fried noodles is 12 yuan.");

    }

    @Override
    public float cost() {
        return getPrice();
    }


}
