package id.lmnzr.teaching.designpattern.factory.withfactory.model;

public final class MushroomPizza extends Pizza{
    public MushroomPizza() {
        super(PizzaType.MUSHROOM);
    }

    @Override
    protected void topping(){
        System.out.println("put mushroom");
    }
}
