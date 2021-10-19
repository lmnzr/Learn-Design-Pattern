package id.lmnzr.teaching.designpattern.adapter.pro;

import id.lmnzr.teaching.designpattern.adapter.lib.legacyaudio.MediaPlayer;
import id.lmnzr.teaching.designpattern.adapter.lib.proaudio.MediaAdapter;

public class ProMediaPlayer {
    private ProMediaPlayer() {
    }

    public static void play(String fileType, String fileName) {
        MediaPlayer player = new MediaAdapter(fileType);
        player.play(fileType, fileName);
    }
}
