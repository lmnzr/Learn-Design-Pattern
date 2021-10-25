package id.lmnzr.teaching.designpattern.factory.model;

public enum  PizzaType {
    MUSHROOM("mushroom"),
    PEPPERONI("pepperoni"),
    CHICKEN("chicken"),
    BEEF("beef");

    private final String type;

    PizzaType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static PizzaType getFromType(String type) {
        for (PizzaType pizzaType : PizzaType.values()) {
            if (pizzaType.type.equalsIgnoreCase(type)) {
                return pizzaType;
            }
        }
        return null;
    }
}
