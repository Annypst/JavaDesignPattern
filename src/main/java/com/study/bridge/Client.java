package main.java.com.study.bridge;

public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AviFile());
        system.play("视频A");

        OperatingSystem system2 = new Win(new Mp4File());
        system2.play("视频B");
    }
}
