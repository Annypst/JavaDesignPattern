package main.java.com.study.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation c1 = citation.clone();
        c1.setName("Alice");
        Citation c2 = citation.clone();
        c2.setName("Bob");
        Citation c3 = citation.clone();
        c3.setName("John");
        Citation c4 = citation.clone();
        c4.setName("William");
        c1.show();
        c2.show();
        c3.show();
        c4.show();
    }
}
