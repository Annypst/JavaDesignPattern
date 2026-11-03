package main.java.com.study.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg=computer.readSD(new SDCardImpl());
        System.out.println(msg);

        //读TF发现不能直接读取

        System.out.println(computer.readSD(new SDAdapter()));

    }
}
