package id.lmnzr.teaching.designpattern.factory.withfactory;

import id.lmnzr.teaching.designpattern.factory.withfactory.handler.PizzaFactory;
import id.lmnzr.teaching.designpattern.factory.withfactory.handler.PizzaFactoryImpl;
import id.lmnzr.teaching.designpattern.factory.withfactory.model.Pizza;

public class FactoryPizzaStore {
    private FactoryPizzaStore() {
    }

    public static void orderPizza(String type) {
        PizzaFactory factory = new PizzaFactoryImpl();
        Pizza pizza = factory.createPizza(type);
        pizza.order();
    }
}
