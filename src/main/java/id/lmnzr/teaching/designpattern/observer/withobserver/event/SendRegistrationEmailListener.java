package id.lmnzr.teaching.designpattern.observer.withobserver.event;

import id.lmnzr.teaching.designpattern.observer.lib.MailService;

public class SendRegistrationEmailListener implements EventListener {
    private final MailService mailService;

    public SendRegistrationEmailListener() {
        this.mailService = new MailService();
    }

    @Override
    public void update(String eventType, String data) {
        mailService.sendRegistrationEmail(data);
    }
}
