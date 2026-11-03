package main.java.com.study.prototype.test1;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("Alice");
        citation.setStu(stu);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Zhouh\\Desktop\\JavaDesignPattern\\src\\main\\java\\com\\study\\prototype\\test1\\test.txt"));
        oos.writeObject(citation);
        oos.close();

        //input

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Zhouh\\Desktop\\JavaDesignPattern\\src\\main\\java\\com\\study\\prototype\\test1\\test.txt"));

        Citation citation1 = (Citation) ois.readObject();

        ois.close();

        Student stu1 = citation1.getStu();
        stu1.setName("Bob");

        citation.show();
        citation1.show();



    }
}
