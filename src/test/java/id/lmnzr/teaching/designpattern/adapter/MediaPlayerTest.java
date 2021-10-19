package id.lmnzr.teaching.designpattern.adapter;

import id.lmnzr.teaching.designpattern.adapter.base.BaseMediaPlayer;
import id.lmnzr.teaching.designpattern.adapter.pro.ProMediaPlayer;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaPlayerTest {
    @Test
    void givenMp3File_whenPlay_thenShouldPlayMp3() throws Exception {
        String order = tapSystemOut(() -> {
            BaseMediaPlayer.play("mp3", "lagu.mp3");
//            ProMediaPlayer.play("mp3", "lagu.mp3");
        });

        assertEquals("Playing mp3 file. Name: lagu.mp3", order.trim());
    }

    @Test
    void givenWavFile_whenPlay_thenShouldPlayWav() throws Exception {
        String order = tapSystemOut(() -> {
            BaseMediaPlayer.play("wav", "lagu.wav");
//            ProMediaPlayer.play("wav", "lagu.wav");
        });

        assertEquals("Playing wav file. Name: lagu.wav", order.trim());
    }

    @Test
    void givenMp4File_whenPlay_thenShouldPlayMp4() throws Exception {
        String order = tapSystemOut(() -> {
            BaseMediaPlayer.play("mp4", "lagu.mp4");
//            ProMediaPlayer.play("mp4", "lagu.mp4");
        });

        assertEquals("Playing mp4 file. Name: lagu.mp4", order.trim());
    }

    @Test
    void givenFlacFile_whenPlay_thenShouldPlayFlac() throws Exception {
        String order = tapSystemOut(() -> {
            BaseMediaPlayer.play("flac", "lagu.flac");
//            ProMediaPlayer.play("flac", "lagu.flac");
        });

        assertEquals("Playing flac file. Name: lagu.flac", order.trim());
    }
}
