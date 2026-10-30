package main.java.com.study.iterator;

public class Client {

    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();

        aggregate.addStudent(new Student("Alice","1"));
        aggregate.addStudent(new Student("Bob","2"));
        aggregate.addStudent(new Student("Jon","3"));

        StudentIterator iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
