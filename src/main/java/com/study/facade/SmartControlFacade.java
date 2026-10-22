package main.java.com.study.facade;

public class SmartControlFacade {

    //聚合那些内部的对象，直接表现为新建实例,client 主要和facade交互而不用管内部究竟有什么逻辑
    private Light light ;
    private TV tv ;
    private AC ac ;

    //Constructor
    public SmartControlFacade() {
        light = new Light();

        tv = new TV();

        ac = new AC();

    }

    // Client use method

    public void say(String msg){

        if (msg.contains("on")){

            on();


        } else if(msg.contains("off")){

            off();


        } else {

            System.out.println("input error!!");

        }
    }

    // a method to control all device

    private void on(){

        light.on();
        tv.on();
        ac.on();

        System.out.println("all devices have been turned on!");

    }

    private void off(){

        light.off();
        tv.off();
        ac.off();

        System.out.println("all devices have been turned off!");

    }


}
