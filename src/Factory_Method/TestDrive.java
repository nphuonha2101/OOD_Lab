package Factory_Method;

public class TestDrive {
    public static void main(String[] args) {
        Pizza pizza = new NYStyleClamPizza();
        System.out.println(pizza.toString());

        PizzaStore ny =new NYStylePizzaStore();
        System.out.println("I've ordered: " + ny.orderPizza("cheese"));
    }
}
