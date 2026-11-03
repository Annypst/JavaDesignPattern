package main.java.com.study.adapter.object_adapter;


public class SDAdapterTF implements SDCard {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        return "使用适配器读取TF数据:"+tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器向TF写了" + msg);
       tfCard.writeTF(msg);
    }
}
