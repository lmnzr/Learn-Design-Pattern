package id.lmnzr.teaching.designpattern.observer.withobserver;

import id.lmnzr.teaching.designpattern.observer.withobserver.event.EventManager;
import id.lmnzr.teaching.designpattern.observer.withobserver.event.SendRegistrationEmailListener;

public class ObserverRegisterService {
    public final EventManager events;

    public ObserverRegisterService(EventManager events) {
        this.events = events;
        events.subscribe("register", new SendRegistrationEmailListener());
    }

    public boolean registration(String username, String password) {
        System.out.println("registration successful " + username);
        events.notify("register", username);
        return true;
    }
}
