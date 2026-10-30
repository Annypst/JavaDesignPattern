package main.java.com.study.obsrver;



public interface Subject {
    //订阅者
    void attach (Observer observer);

    //-订阅者
    void detach (Observer observer);

    //通知订阅者
    void notify (String msg);

}
