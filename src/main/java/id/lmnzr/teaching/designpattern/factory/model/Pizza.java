package id.lmnzr.teaching.designpattern.factory.model;

public abstract class Pizza {
    PizzaType type;

    protected Pizza(PizzaType type) {
        this.type = type;
        order();
    }

    public PizzaType getType() {
        return this.type;
    }

    protected void preparation() {
        System.out.println("make the base");
        System.out.println("put the sauce");
        System.out.println("grate cheese generously");
    }

    protected void topping() {
    }

    protected void bake() {
        System.out.println("bake in the oven");
    }

    protected void cut() {
        System.out.println("cut in 8 slices");
    }

    protected void boxing() {
        System.out.println("put in box");
    }

    protected void deliver() {
        System.out.println("deliver it");
    }

    protected void finish() {
        System.out.printf("your %s pizza done%n", type.getType());
    }

    public void order() {
        preparation();
        topping();
        bake();
        cut();
        boxing();
        deliver();
        finish();
    }
}
