package id.lmnzr.teaching.designpattern.payment.factory;

public class BankPayment extends Payment {

    @Override
    public void requestPaymentData() {
        System.out.println("Pay with bank !");
        System.out.println("select Bank !");
    }
}
