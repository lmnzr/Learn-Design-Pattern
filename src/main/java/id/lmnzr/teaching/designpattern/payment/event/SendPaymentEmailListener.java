package id.lmnzr.teaching.designpattern.payment.event;


import id.lmnzr.teaching.designpattern.payment.lib.MailService;

public class SendPaymentEmailListener implements EventListener {
    private final MailService mailService;

    public SendPaymentEmailListener() {
        this.mailService = new MailService();
    }

    @Override
    public void update(String eventType, String data) {
        mailService.sendPaymentEmail(data);
    }
}
