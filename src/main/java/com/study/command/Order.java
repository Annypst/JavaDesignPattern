package main.java.com.study.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
    //table no
    private int table;
    //count
    private Map<String,Integer> foodDir = new HashMap<String,Integer>();

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public Map<String, Integer> getFood() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
