package id.lmnzr.teaching.designpattern.facade.nofacade;

import id.lmnzr.teaching.designpattern.facade.lib.*;

public class NoFacadeVideoConverter {
    private final MPEG4CompressionCodec mpeg4CompressionCodec;

    private final OggCompressionCodec oggCompressionCodec;

    private final VideoReader videoReader;

    private final VideoProcessor videoProcessor;

    private final VideoWriter videoWriter;

    public NoFacadeVideoConverter() {
        this.mpeg4CompressionCodec = new MPEG4CompressionCodec();
        this.oggCompressionCodec = new OggCompressionCodec();
        this.videoReader = new VideoReader();
        this.videoProcessor = new VideoProcessor();
        this.videoWriter = new VideoWriter();
    }

    public void convert(String videoFile) throws Exception {
        String ext = "." + videoFile.split("\\.")[1];
        if (ext.equalsIgnoreCase(mpeg4CompressionCodec.getExtension())) {
            VideoFile videoFileOriginal = videoReader.read(videoFile, mpeg4CompressionCodec);
            VideoFile videoFileConverted = videoProcessor
                .convert(videoFileOriginal,mpeg4CompressionCodec,oggCompressionCodec);
            videoWriter.write(videoFileConverted);
            return;
        }

        if (ext.equalsIgnoreCase(oggCompressionCodec.getExtension())) {
            VideoFile videoFileOriginal = videoReader.read(videoFile, oggCompressionCodec);
            VideoFile videoFileConverted = videoProcessor
                .convert(videoFileOriginal,oggCompressionCodec,mpeg4CompressionCodec);
            videoWriter.write(videoFileConverted);
            return;
        }

        throw new Exception("file not supported");
    }
}
