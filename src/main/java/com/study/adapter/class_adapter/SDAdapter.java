package main.java.com.study.adapter.class_adapter;

public class SDAdapter extends TFCardImpI implements SDCard {
    @Override
    public String readSD() {
        return "使用适配器读取TF数据:"+readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器向TF写了" + msg);
        writeTF(msg);
    }
}
