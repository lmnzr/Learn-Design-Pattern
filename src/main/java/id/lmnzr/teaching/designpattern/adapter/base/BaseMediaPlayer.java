package id.lmnzr.teaching.designpattern.adapter.base;

import id.lmnzr.teaching.designpattern.adapter.lib.legacyaudio.BasicAudioPlayer;
import id.lmnzr.teaching.designpattern.adapter.lib.legacyaudio.MediaPlayer;

public class BaseMediaPlayer {
    private BaseMediaPlayer() {
    }

    public static void play(String fileType, String fileName) {
        MediaPlayer player = new BasicAudioPlayer();
        player.play(fileType, fileName);
    }
}
