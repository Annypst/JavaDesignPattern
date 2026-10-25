package main.java.com.study.decorate;
//装饰者
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1,"add a egg",fastFood);
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
