package id.lmnzr.teaching.designpattern.facade.lib;

public final class VideoFile {
    private final String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
