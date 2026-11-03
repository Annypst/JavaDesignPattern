package main.java.com.study.bridge;

public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Decode a AVI video"+ fileName);
    }
}
