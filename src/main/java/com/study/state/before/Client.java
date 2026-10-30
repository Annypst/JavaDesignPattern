package main.java.com.study.state.before;

public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.OPEN);
        lift.open();
        lift.close();
    }
}
