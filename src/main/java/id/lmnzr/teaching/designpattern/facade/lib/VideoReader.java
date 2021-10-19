package id.lmnzr.teaching.designpattern.facade.lib;

public class VideoReader {
    public VideoFile read(String filename, VideoCodec codec) {
        System.out.printf("read %s with codec %s%n", filename, codec.getType());
        return new VideoFile(filename);
    }
}
