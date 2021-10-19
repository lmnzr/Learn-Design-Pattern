package id.lmnzr.teaching.designpattern.factory.withfactory.model;

public final class BeefPizza extends Pizza{
    public BeefPizza() {
        super(PizzaType.BEEF);
    }

    @Override
    protected void topping(){
        System.out.println("sprinkle sauteed minced beef");
    }
}
