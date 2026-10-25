package main.java.com.study.decorate;
//具体构建角色
public class FriedRice extends FastFood {

    public FriedRice() {

        super(10,"The price of fried rice is 10 yuan.");
    }

    @Override
    public float cost() {
        return getPrice();
    }


}
