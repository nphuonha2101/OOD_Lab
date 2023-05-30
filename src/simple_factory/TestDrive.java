package simple_factory;

public class TestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        System.out.println(pizzaStore.orderPizza("Cheese"));
        System.out.println(pizzaStore.orderPizza("Clam"));
        System.out.println(pizzaStore.orderPizza("Verggie"));

    }


}
