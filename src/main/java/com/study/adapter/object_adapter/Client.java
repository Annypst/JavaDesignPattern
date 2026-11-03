package main.java.com.study.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg=computer.readSD(new SDCardImpl());
        System.out.println(msg);

        //读TF发现不能直接读取

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpI());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
