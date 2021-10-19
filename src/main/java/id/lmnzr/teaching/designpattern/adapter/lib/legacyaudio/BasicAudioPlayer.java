package id.lmnzr.teaching.designpattern.adapter.lib.legacyaudio;

import java.util.Arrays;
import java.util.List;

public class BasicAudioPlayer implements MediaPlayer {
    public static final List<String> SUPPORTED_TYPE = Arrays.asList("mp3", "wav");

    @Override
    public void play(String audioType, String fileName) {
        String fileType = SUPPORTED_TYPE
            .stream()
            .filter(type -> type.equalsIgnoreCase(audioType))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("unsuported"));
        System.out.printf("Playing %s file. Name: %s%n", fileType, fileName);
    }
}
