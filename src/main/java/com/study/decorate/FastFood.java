package main.java.com.study.decorate;
//抽象构建角色
public abstract class FastFood {

    private float price;
    private String description;

    public FastFood() {
    }

    public FastFood(float price, String description) {
        this.price = price;
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
