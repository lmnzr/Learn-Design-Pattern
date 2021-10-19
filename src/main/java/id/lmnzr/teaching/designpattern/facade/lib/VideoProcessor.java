package id.lmnzr.teaching.designpattern.facade.lib;

public class VideoProcessor {
    public VideoFile convert(VideoFile videoFile, VideoCodec fromCodec, VideoCodec destCodec) {
        String convertedFile = videoFile.getFileName()
            .replace(fromCodec.getExtension(), destCodec.getExtension());

        System.out.printf("convert %s with codec %s into %s%n",
            videoFile.getFileName(), destCodec.getType(), convertedFile
        );

        return new VideoFile(convertedFile);
    }
}
