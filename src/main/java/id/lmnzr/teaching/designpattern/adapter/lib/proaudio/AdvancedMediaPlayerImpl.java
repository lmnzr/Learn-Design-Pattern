package id.lmnzr.teaching.designpattern.adapter.lib.proaudio;

import java.util.Arrays;
import java.util.List;

public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer {
    public static final List<String> SUPPORTED_TYPE = Arrays.asList("mp4", "flac");

    @Override
    public void play(String audioType, String fileName, String audioCodec) {
        String fileType = SUPPORTED_TYPE
            .stream()
            .filter(type -> type.equalsIgnoreCase(audioType))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("unsuported"));
        System.out.printf("Playing %s file. Name: %s%n", fileType, fileName);
    }
}
