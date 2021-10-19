package id.lmnzr.teaching.designpattern.factory;

import id.lmnzr.teaching.designpattern.factory.nofactory.NoFactoryPizzaStore;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PizzaStoreTest {
    @Test
    void givenMushroomRequest_whenOrder_thenShouldDeliverMushroomPizza() throws Exception {
        String order = tapSystemOut(() -> {
            NoFactoryPizzaStore.orderPizza("mushroom");
        });

//        String order = tapSystemOut(() -> {
//            FactoryPizzaStore.orderPizza("mushroom");
//        });

        assertEquals(
            "make the base\n" +
                "put the sauce\n" +
                "grate cheese generously\n" +
                "put mushroom\n" +
                "bake in the oven\n" +
                "cut in 8 slices\n" +
                "put in box\n" +
                "deliver it\n" +
                "your mushroom pizza done",
            order.trim());
    }

    @Test
    void givenPepperoniRequest_whenOrder_thenShouldDeliverPepperoniPizza() throws Exception {
        String order = tapSystemOut(() -> {
            NoFactoryPizzaStore.orderPizza("pepperoni");
        });

//        String order = tapSystemOut(() -> {
//            FactoryPizzaStore.orderPizza("pepperoni");
//        });

        assertEquals(
            "make the base\n" +
                "put the sauce\n" +
                "grate cheese generously\n" +
                "put pepperoni\n" +
                "bake in the oven\n" +
                "cut in 8 slices\n" +
                "put in box\n" +
                "deliver it\n" +
                "your pepperoni pizza done",
            order.trim());
    }

    @Test
    void givenChickenRequest_whenOrder_thenShouldDeliverChickenPizza() throws Exception {
        String order = tapSystemOut(() -> {
            NoFactoryPizzaStore.orderPizza("chicken");
        });

//        String order = tapSystemOut(() -> {
//            FactoryPizzaStore.orderPizza("chicken");
//        });

        assertEquals(
            "make the base\n" +
                "put the sauce\n" +
                "grate cheese generously\n" +
                "put baked chicken slice\n" +
                "bake in the oven\n" +
                "cut in 8 slices\n" +
                "put in box\n" +
                "deliver it\n" +
                "your chicken pizza done",
            order.trim());
    }

    @Test
    void givenBeefRequest_whenOrder_thenShouldDeliverBeefPizza() throws Exception {
        String order = tapSystemOut(() -> {
            NoFactoryPizzaStore.orderPizza("beef");
        });

//        String order = tapSystemOut(() -> {
//            FactoryPizzaStore.orderPizza("beef");
//        });

        assertEquals(
            "make the base\n" +
                "put the sauce\n" +
                "grate cheese generously\n" +
                "sprinkle sauteed minced beef\n" +
                "bake in the oven\n" +
                "cut in 8 slices\n" +
                "put in box\n" +
                "deliver it\n" +
                "your beef pizza done",
            order.trim());
    }

    @Test
    void givenTunaRequest_whenOrder_thenShouldThrowIllegalArgument() {
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> NoFactoryPizzaStore.orderPizza("tuna")
        );

//        Exception exception = assertThrows(
//            IllegalArgumentException.class,
//            () -> FactoryPizzaStore.orderPizza("tuna")
//        );

        assertEquals("can't order tuna pizza", exception.getMessage());
    }
}
