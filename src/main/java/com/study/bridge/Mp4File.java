package main.java.com.study.bridge;

public class Mp4File implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("decode a MP4 video"+fileName);
    }
}
