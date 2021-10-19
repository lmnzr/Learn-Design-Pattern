package id.lmnzr.teaching.designpattern.observer;

import id.lmnzr.teaching.designpattern.observer.noobserver.NoObserverRegisterService;
import id.lmnzr.teaching.designpattern.observer.withobserver.ObserverRegisterService;
import id.lmnzr.teaching.designpattern.observer.withobserver.event.EventManager;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterServiceTest {
    @Test
    void givenUsernameAndPass_whenRegister_thenShouldSendEmail() throws Exception {
        String registration = tapSystemOut(() -> {
//            NoObserverRegisterService registerService = new NoObserverRegisterService();
//            registerService.registration("user@mail.com", "abcdefg");

            EventManager eventManager = new EventManager("register");
            ObserverRegisterService registerService = new ObserverRegisterService(eventManager);
            registerService.registration("user@mail.com", "abcdefg");
        });

        assertEquals(
            "registration successful user@mail.com\n" +
                "send registration email to user@mail.com",
            registration.trim());
    }
}
