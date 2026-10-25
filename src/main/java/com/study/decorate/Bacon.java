package main.java.com.study.decorate;

public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(2,"add a Bacon",fastFood);
    }


    @Override
    public float cost() {

        //计算
        return getPrice()+getFastFood().cost();
    }


    @Override
    public String getDescription() {
        return super.getDescription() + getFastFood().getDescription();
    }
}
