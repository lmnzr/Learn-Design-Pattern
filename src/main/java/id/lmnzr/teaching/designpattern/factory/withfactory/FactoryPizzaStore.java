package id.lmnzr.teaching.designpattern.factory.withfactory;

import id.lmnzr.teaching.designpattern.factory.withfactory.handler.PizzaFactoryImpl;

public class FactoryPizzaStore {
    private FactoryPizzaStore() {
    }

    public static void orderPizza(String type) {
        PizzaFactoryImpl factory = new PizzaFactoryImpl();
        factory.createPizza(type);
    }
}
