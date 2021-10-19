package id.lmnzr.teaching.designpattern.factory.nofactory;

public class NoFactoryPizzaStore {
    private NoFactoryPizzaStore() {
    }

    public static void orderPizza(String type) {

        if ("mushroom".equalsIgnoreCase(type)) {
            System.out.println("make the base");
            System.out.println("put the sauce");
            System.out.println("grate cheese generously");
            System.out.println("put mushroom");
            System.out.println("bake in the oven");
            System.out.println("cut in 8 slices");
            System.out.println("put in box");
            System.out.println("deliver it");
            System.out.println("your mushroom pizza done");
            return;
        }

        if ("pepperoni".equalsIgnoreCase(type)) {
            System.out.println("make the base");
            System.out.println("put the sauce");
            System.out.println("grate cheese generously");
            System.out.println("put pepperoni");
            System.out.println("bake in the oven");
            System.out.println("cut in 8 slices");
            System.out.println("put in box");
            System.out.println("deliver it");
            System.out.println("your pepperoni pizza done");
            return;
        }

        if ("chicken".equalsIgnoreCase(type)) {
            System.out.println("make the base");
            System.out.println("put the sauce");
            System.out.println("grate cheese generously");
            System.out.println("put baked chicken slice");
            System.out.println("bake in the oven");
            System.out.println("cut in 8 slices");
            System.out.println("put in box");
            System.out.println("deliver it");
            System.out.println("your chicken pizza done");
            return;
        }

        if ("beef".equalsIgnoreCase(type)) {
            System.out.println("make the base");
            System.out.println("put the sauce");
            System.out.println("grate cheese generously");
            System.out.println("sprinkle sauteed minced beef");
            System.out.println("bake in the oven");
            System.out.println("cut in 8 slices");
            System.out.println("put in box");
            System.out.println("deliver it");
            System.out.println("your beef pizza done");
            return;
        }

        throw new IllegalArgumentException("can't order " + type + " pizza");
    }
}
