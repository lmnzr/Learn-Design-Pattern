package id.lmnzr.teaching.designpattern.facade.lib;

public class VideoWriter {
    public void write(VideoFile videoFile) {
        System.out.printf("write video %s%n", videoFile.getFileName());
    }
}
