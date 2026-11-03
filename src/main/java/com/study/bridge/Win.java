package main.java.com.study.bridge;

public class Win extends OperatingSystem{
    public Win(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
