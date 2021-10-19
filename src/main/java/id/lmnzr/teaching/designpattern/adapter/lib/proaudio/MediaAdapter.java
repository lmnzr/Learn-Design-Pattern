package id.lmnzr.teaching.designpattern.adapter.lib.proaudio;

import id.lmnzr.teaching.designpattern.adapter.lib.legacyaudio.BasicAudioPlayer;
import id.lmnzr.teaching.designpattern.adapter.lib.legacyaudio.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    BasicAudioPlayer basicAudioPlayer;

    public MediaAdapter(String audioType) {
        if (AdvancedMediaPlayerImpl.SUPPORTED_TYPE.contains(audioType)) {
            advancedMusicPlayer = new AdvancedMediaPlayerImpl();
        } else {
            basicAudioPlayer = new BasicAudioPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (AdvancedMediaPlayerImpl.SUPPORTED_TYPE.contains(audioType)) {
            advancedMusicPlayer.play(audioType, fileName, AudioProperties.codecPath);
        } else {
            basicAudioPlayer.play(audioType, fileName);
        }
    }
}
