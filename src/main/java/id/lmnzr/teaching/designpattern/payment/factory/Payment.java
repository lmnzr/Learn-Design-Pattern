package id.lmnzr.teaching.designpattern.payment.factory;

import id.lmnzr.teaching.designpattern.payment.dto.TransactionDetailDto;

public abstract class Payment {
    public Long submitPaymentDetail(TransactionDetailDto trx, Payment payment) {
        payment.requestPaymentData();
        System.out.println("you buy : " + String.join(",", trx.getProducts()));
        System.out.println("total : " + trx.getTotal());
        return 1L;
    }

    public void requestPaymentData() {
    }
}
