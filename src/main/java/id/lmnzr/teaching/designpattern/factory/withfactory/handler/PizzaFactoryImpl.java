package id.lmnzr.teaching.designpattern.factory.withfactory.handler;

import id.lmnzr.teaching.designpattern.factory.withfactory.model.*;

import java.util.*;

public class PizzaFactoryImpl implements PizzaFactory {

    private static final List<Pizza> pizzaList = Arrays.asList(
        new MushroomPizza(),
        new PepperoniPizza(),
        new ChickenPizza(),
        new BeefPizza()
    );

    private final Map<PizzaType, Pizza> pizzaMap;

    public PizzaFactoryImpl() {
        pizzaMap = new EnumMap<>(PizzaType.class);
        pizzaList.forEach(pizza -> pizzaMap.put(pizza.getType(), pizza));
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = pizzaMap.get(PizzaType.getFromType(type));
        if (pizza == null) {
            throw new IllegalArgumentException("can't order " + type + " pizza");
        }

        return pizza;
    }
}
