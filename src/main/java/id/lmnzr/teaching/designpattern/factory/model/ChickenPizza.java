package id.lmnzr.teaching.designpattern.factory.model;

public final class ChickenPizza extends Pizza{
    public ChickenPizza() {
        super(PizzaType.CHICKEN);
    }

    @Override
    protected void topping(){
        System.out.println("put baked chicken slice");
    }
}
