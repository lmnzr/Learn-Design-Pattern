package id.lmnzr.teaching.designpattern.payment.factory;

public class PaypalPayment extends Payment {

    @Override
    public void requestPaymentData() {
        System.out.println("Pay with paypal !");
        System.out.println("Input username and password!");
    }
}
