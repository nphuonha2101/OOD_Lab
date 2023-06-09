package simple_factory;

public class PizzaStore {
    private SimplePizzaFactory factory;

    public  PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        return pizza;
    }
}
