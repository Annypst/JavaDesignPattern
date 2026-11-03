package main.java.com.study.combination;

public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理",2);
        MenuComponent menu2 = new Menu("角色管理",2);
        MenuComponent menu3 = new Menu("权限管理",2);
        menu1.add(new MenuItem("域名访问",3));
        menu1.add(new MenuItem("菜单访问",3));
        menu1.add(new MenuItem("删除菜单",3));
        menu1.add(new MenuItem("新增菜单",3));


        menu2.add(new MenuItem("新增角色",3));
        menu2.add(new MenuItem("删除角色",3));


        menu3.add(new MenuItem("提交",3));
        menu3.add(new MenuItem("删除权限",3));

        MenuComponent component = new Menu("总系统",1);
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        //print
        component.print();
    }
}
