package id.lmnzr.teaching.designpattern.factory.withfactory.handler;

import id.lmnzr.teaching.designpattern.factory.withfactory.model.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}
