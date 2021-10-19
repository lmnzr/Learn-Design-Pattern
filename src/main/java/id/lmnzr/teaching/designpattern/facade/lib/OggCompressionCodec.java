package id.lmnzr.teaching.designpattern.facade.lib;

public class OggCompressionCodec implements VideoCodec{
    @Override
    public String getExtension() {
        return ".ogg";
    }

    @Override
    public String getType() {
        return "OGG";
    }
}
