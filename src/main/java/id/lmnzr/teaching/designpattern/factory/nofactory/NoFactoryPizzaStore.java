package id.lmnzr.teaching.designpattern.factory.nofactory;

import id.lmnzr.teaching.designpattern.factory.model.BeefPizza;
import id.lmnzr.teaching.designpattern.factory.model.ChickenPizza;
import id.lmnzr.teaching.designpattern.factory.model.MushroomPizza;
import id.lmnzr.teaching.designpattern.factory.model.PepperoniPizza;

public class NoFactoryPizzaStore {
    private NoFactoryPizzaStore() {
    }

    public static void orderPizza(String type) {

        if ("mushroom".equalsIgnoreCase(type)) {
            new MushroomPizza();
            return;
        }

        if ("pepperoni".equalsIgnoreCase(type)) {
            new PepperoniPizza();
            return;
        }

        if ("chicken".equalsIgnoreCase(type)) {
            new ChickenPizza();
            return;
        }

        if ("beef".equalsIgnoreCase(type)) {
            new BeefPizza();
            return;
        }

        throw new IllegalArgumentException("can't order " + type + " pizza");
    }
}
