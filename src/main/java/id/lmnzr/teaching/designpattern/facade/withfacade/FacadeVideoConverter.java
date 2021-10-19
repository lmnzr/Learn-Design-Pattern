package id.lmnzr.teaching.designpattern.facade.withfacade;

public class FacadeVideoConverter {
    private final VideoConverterService converterService;

    public FacadeVideoConverter() {
        this.converterService = new VideoConverterService();
    }

    public void convert(String videoFile) throws Exception {
        converterService.convertVideo(videoFile);
    }
}
