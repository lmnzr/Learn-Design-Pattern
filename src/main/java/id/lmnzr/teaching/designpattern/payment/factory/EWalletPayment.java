package id.lmnzr.teaching.designpattern.payment.factory;

public class EWalletPayment extends Payment{

    @Override
    public void requestPaymentData() {
        System.out.println("Pay with E-Wallet !");
        System.out.println("Input phone number !");
    }
}
