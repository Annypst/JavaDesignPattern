package main.java.com.study.adapter.class_adapter;

public class TFCardImpI implements TFCard{
    @Override
    public String readTF() {
        return "TFCard 读取了";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF 写入了" + msg);
    }
}
