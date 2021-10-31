package id.lmnzr.teaching.designpattern.payment.event;

public interface EventListener {
    void update(String eventType, String data);
}
