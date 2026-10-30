package main.java.com.study.state.before;

public interface ILift {
    int OPEN = 1;
    int CLOSING = 2;
    int RUNNING = 3;
    int STOPPING = 4;

    void setState(int state);
    public void open();
    public void close();
    public void run();
    public void stop();
}
