package main.java.com.study.obsrver;

public class Client {

    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        subject.attach(new WeiXinUser("User A"));
        subject.attach(new WeiXinUser("User B"));
        subject.attach(new WeiXinUser("User C"));


        subject.notify("新文章发布了");

    }
}
