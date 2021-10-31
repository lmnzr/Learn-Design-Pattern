package id.lmnzr.teaching.designpattern.payment.dto;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class TransactionDetailDto {
    private final Map<String, Integer> transaction;

    public TransactionDetailDto(Map<String, Integer> transaction) {
        this.transaction = transaction;
    }

    public Set<String> getProducts() {
        return transaction.keySet();
    }

    public Integer getTotal() {
        AtomicReference<Integer> total = new AtomicReference<>(0);
        transaction.forEach((key,value)-> total.updateAndGet(v -> v + value));
        return total.get();
    }
}
