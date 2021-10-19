package id.lmnzr.teaching.designpattern.observer.noobserver;

import id.lmnzr.teaching.designpattern.observer.lib.MailService;

public class NoObserverRegisterService {
    private final MailService mailService;

    public NoObserverRegisterService() {
        this.mailService = new MailService();
    }

    public boolean registration(String username, String password) {
        System.out.println("registration successful " + username);
        mailService.sendRegistrationEmail(username);
        return true;
    }
}
