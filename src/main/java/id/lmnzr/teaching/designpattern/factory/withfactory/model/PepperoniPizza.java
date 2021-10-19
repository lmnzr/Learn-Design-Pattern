package id.lmnzr.teaching.designpattern.factory.withfactory.model;

public final class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        super(PizzaType.PEPPERONI);
    }

    @Override
    protected void topping(){
        System.out.println("put pepperoni");
    }
}
