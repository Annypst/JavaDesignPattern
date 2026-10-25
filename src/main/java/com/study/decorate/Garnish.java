package main.java.com.study.decorate;
//抽象装饰者类，继承+聚合
public abstract class Garnish extends FastFood {

//聚合

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String description, FastFood fastFood) {
        super(price, description);
        this.fastFood = fastFood;
    }


}
