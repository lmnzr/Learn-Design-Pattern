package id.lmnzr.teaching.designpattern.payment.factory;

public class PaymentFactory {
    public Payment getPayment(String type){
        if("cc".equalsIgnoreCase(type)){
            return new CreditCardPayment();
        }

        if("ewallet".equalsIgnoreCase(type)){
            return new EWalletPayment();
        }

        if("bank".equalsIgnoreCase(type)){
            return new BankPayment();
        }

        if("paypal".equalsIgnoreCase(type)){
            return new PaypalPayment();
        }

        throw new IllegalArgumentException("unknown type");
    }
}
