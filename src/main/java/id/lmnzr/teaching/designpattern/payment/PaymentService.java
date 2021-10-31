package id.lmnzr.teaching.designpattern.payment;

import id.lmnzr.teaching.designpattern.payment.factory.Payment;
import id.lmnzr.teaching.designpattern.payment.factory.PaymentFactory;
import id.lmnzr.teaching.designpattern.payment.dto.TransactionDetailDto;
import id.lmnzr.teaching.designpattern.payment.event.EventManager;
import id.lmnzr.teaching.designpattern.payment.event.SendPaymentEmailListener;

public class PaymentService {
    private final PaymentFactory paymentFactory;

    private final EventManager eventManager;

    public PaymentService(EventManager eventManager) {
        this.paymentFactory = new PaymentFactory();
        this.eventManager = eventManager;
        eventManager.subscribe("payment", new SendPaymentEmailListener());
    }

    public void createOrder(TransactionDetailDto transactionDetailDto, String paymentType, String userEmail) {
        Payment payment = paymentFactory.getPayment(paymentType);
        payment.submitPaymentDetail(transactionDetailDto, payment);
        eventManager.notify("payment",userEmail);
    }
}
