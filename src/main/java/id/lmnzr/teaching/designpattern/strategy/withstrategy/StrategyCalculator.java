package id.lmnzr.teaching.designpattern.strategy.withstrategy;

import id.lmnzr.teaching.designpattern.strategy.OperationType;
import id.lmnzr.teaching.designpattern.strategy.withstrategy.operation.*;

public class StrategyCalculator {
    public int calculate(OperationType operationType, int num1, int num2) {
        if (OperationType.PLUS.equals(operationType)) {
            Operation operation = new OperationAdd();
            return operation.doOperation(num1, num2);
        }

        if (OperationType.MINUS.equals(operationType)) {
            Operation operation = new OperationSubstract();
            return operation.doOperation(num1, num2);
        }

        if (OperationType.TIMES.equals(operationType)) {
            Operation operation = new OperationMultiply();
            return operation.doOperation(num1, num2);
        }

        if (OperationType.DIVISION.equals(operationType)) {
            Operation operation = new OperationDivide();
            return operation.doOperation(num1, num2);
        }

        throw new IllegalArgumentException("unknown type " + operationType);
    }
}
