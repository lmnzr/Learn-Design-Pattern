package id.lmnzr.teaching.designpattern.payment;

import id.lmnzr.teaching.designpattern.payment.dto.TransactionDetailDto;
import id.lmnzr.teaching.designpattern.payment.event.EventManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentServiceTest {
    private EventManager eventManager;

    @BeforeEach
    public void init() {
        eventManager = new EventManager("payment");
    }

    @Test
    void givenPaymentCC_whenCreateOrder_shouldGiveCCPaymentDetail() throws Exception {
        String order = tapSystemOut(() -> {
            executeMockTransaction("cc");
        });

        assertEquals(
            "Pay with credit card !\n" +
                "Input name, date, number, cvv !\n" +
                "you buy : tea,mineral water\n" +
                "total : 4000\n" +
                "send payment email to user@mail.com\n",
            order);
    }

    @Test
    void givenPaymentBank_whenCreateOrder_shouldGiveBankPaymentDetail() throws Exception {
        String order = tapSystemOut(() -> {
            executeMockTransaction("bank");
        });

        assertEquals(
            "Pay with bank !\n" +
                "select Bank !\n" +
                "you buy : tea,mineral water\n" +
                "total : 4000\n" +
                "send payment email to user@mail.com\n",
            order);
    }

    @Test
    void givenPaymentEWallet_whenCreateOrder_shouldGiveEWalletPaymentDetail() throws Exception {
        String order = tapSystemOut(() -> {
            executeMockTransaction("ewallet");
        });

        assertEquals(
            "Pay with E-Wallet !\n" +
                "Input phone number !\n" +
                "you buy : tea,mineral water\n" +
                "total : 4000\n" +
                "send payment email to user@mail.com\n",
            order);
    }

    @Test
    void givenPaymentPaypal_whenCreateOrder_shouldGivePaypalPaymentDetail() throws Exception {
        String order = tapSystemOut(() -> {
            executeMockTransaction("paypal");
        });

        assertEquals(
            "Pay with paypal !\n" +
                "Input username and password!\n" +
                "you buy : tea,mineral water\n" +
                "total : 4000\n" +
                "send payment email to user@mail.com\n",
            order);
    }

    private void executeMockTransaction(String paymentType) {
        PaymentService paymentService = new PaymentService(eventManager);
        Map<String, Integer> order = new HashMap<>();
        order.put("mineral water", 1000);
        order.put("tea", 3000);
        paymentService.createOrder(new TransactionDetailDto(order), paymentType, "user@mail.com");
    }

}