package main.java.com.study.obsrver;

public class WeiXinUser implements Observer{
    private String name;
    @Override
    public void update(String message) {
        System.out.println(name + "接收到了消息"+message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeiXinUser(String name) {
        this.name = name;
    }
}
