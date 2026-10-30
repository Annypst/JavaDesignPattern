package main.java.com.study.strategy;
//环境类
public class Salesman {
    private Strategy strategy;

    public Salesman(Strategy strategy) {
        this.strategy = strategy;
    }

    //由促销员向客户展示活动
    public void showToClient() {
        strategy.show();
    }
}
