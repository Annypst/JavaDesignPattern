package main.java.com.study.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    public void orderUp(){
        System.out.println("服务员说：厨师，有订单来了！");
        for (Command command : commands) {
            command.execute();
        }
    }
}
