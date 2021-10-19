package id.lmnzr.teaching.designpattern.strategy.nostrategy;

import id.lmnzr.teaching.designpattern.strategy.OperationType;

public class NoStrategyCalculator {
    public int calculate(OperationType operationType, int num1, int num2) {
        if (OperationType.PLUS.equals(operationType)) {
            return num1 + num2;
        }

        if (OperationType.MINUS.equals(operationType)) {
            return num1 - num2;
        }

        if (OperationType.TIMES.equals(operationType)) {
            return num1 * num2;
        }

        if (OperationType.DIVISION.equals(operationType)) {
            return num1 / num2;
        }

        throw new IllegalArgumentException("unknown type " + operationType);
    }
}
