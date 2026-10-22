package main.java.com.study.facade;

public class Client {
    public static void main(String[] args) {
       //client 只需要和Facade交互即可一键控制全屋家具
        SmartControlFacade f1 = new SmartControlFacade();

        String msg1 = "oh! turn on the devices!";
        String msg2 = "oh! turn off the devices!";
        String msg3 = "I just want to test my voice. ";

        //f1.say(msg1);
        f1.say(msg2);
        //f1.say(msg3);



    }
}
