package id.lmnzr.teaching.designpattern.facade.lib;

public class MPEG4CompressionCodec implements VideoCodec {
    @Override
    public String getExtension() {
        return ".mp4";
    }

    @Override
    public String getType() {
        return "MPEG4";
    }
}
