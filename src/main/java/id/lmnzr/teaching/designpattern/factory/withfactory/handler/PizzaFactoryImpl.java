package id.lmnzr.teaching.designpattern.factory.withfactory.handler;

import id.lmnzr.teaching.designpattern.factory.model.*;

import static id.lmnzr.teaching.designpattern.factory.model.PizzaType.*;

public class PizzaFactoryImpl {

    public Pizza createPizza(String type) {
        Pizza pizza = getPizza(PizzaType.getFromType(type));
        if (pizza == null) {
            throw new IllegalArgumentException("can't order " + type + " pizza");
        }

        return pizza;
    }

    private Pizza getPizza(PizzaType type) {
        if (MUSHROOM.equals(type)) {
            return new MushroomPizza();
        }

        if (PEPPERONI.equals(type)) {
            return new PepperoniPizza();
        }

        if (CHICKEN.equals(type)) {
            return new ChickenPizza();
        }

        if (BEEF.equals(type)) {
            return new BeefPizza();
        }

        return null;
    }
}
