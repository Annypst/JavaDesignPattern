package main.java.com.study.adapter.class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "读取了SD数据";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD 写入了" + msg);
    }


}
