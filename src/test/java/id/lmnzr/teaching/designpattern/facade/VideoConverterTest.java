package id.lmnzr.teaching.designpattern.facade;

import id.lmnzr.teaching.designpattern.facade.nofacade.NoFacadeVideoConverter;
import id.lmnzr.teaching.designpattern.facade.withfacade.FacadeVideoConverter;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VideoConverterTest {
    @Test
    void givenMp4File_whenConvert_thenShouldSaveOggFile() throws Exception {
        String order = tapSystemOut(() -> {
//            NoFacadeVideoConverter videoConverter = new NoFacadeVideoConverter();
//            videoConverter.convert("film.mp4");

            FacadeVideoConverter videoConverter = new FacadeVideoConverter();
            videoConverter.convert("film.mp4");
        });

        assertEquals(
            "read film.mp4 with codec MPEG4\n" +
                "convert film.mp4 with codec OGG into film.ogg\n" +
                "write video film.ogg",
            order.trim());
    }
}
