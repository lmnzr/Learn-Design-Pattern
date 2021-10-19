package id.lmnzr.teaching.designpattern.strategty;

import id.lmnzr.teaching.designpattern.strategy.nostrategy.NoStrategyCalculator;
import id.lmnzr.teaching.designpattern.strategy.withstrategy.StrategyCalculator;
import org.junit.jupiter.api.Test;

import static id.lmnzr.teaching.designpattern.strategy.OperationType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void givenOperationPlus_whenCalculate_thenShouldAddNumbers() {
        NoStrategyCalculator calculator = new NoStrategyCalculator();
//        StrategyCalculator calculator = new StrategyCalculator();
        assertEquals(3, calculator.calculate(PLUS, 1, 2));
    }

    @Test
    void givenOperationMinus_whenCalculate_thenShouldSubstractNumbers() {
        NoStrategyCalculator calculator = new NoStrategyCalculator();
//        StrategyCalculator calculator = new StrategyCalculator();
        assertEquals(3, calculator.calculate(MINUS, 10, 7));
    }

    @Test
    void givenOperationTimes_whenCalculate_thenShouldMultiplyNumbers() {
        NoStrategyCalculator calculator = new NoStrategyCalculator();
//        StrategyCalculator calculator = new StrategyCalculator();
        assertEquals(3, calculator.calculate(TIMES, 1, 3));
    }

    @Test
    void givenOperationDiv_whenCalculate_thenShouldDivideNumbers() {
        NoStrategyCalculator calculator = new NoStrategyCalculator();
//        StrategyCalculator calculator = new StrategyCalculator();
        assertEquals(3, calculator.calculate(DIVISION, 9, 3));
    }
}
