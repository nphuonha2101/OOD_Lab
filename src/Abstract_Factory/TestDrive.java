package Abstract_Factory;

public class TestDrive {
    public static void main(String[] args) {
        Pizza pizza = new CheesePizza(new NYPizzaIngredientFactory());
        pizza.prepare();
        System.out.println(pizza.toString());
    }
}
