package Factory_Method;


public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;

        switch (item) {
            case "cheese": {
                pizza = new NYStyleCheesePizza();
                break;
            }
            case "clam": {
                pizza = new NYStyleClamPizza();
                break;
            }
            case "verggies": {
                pizza = new NYStyleVerggiePizaa();
                break;
            }
        }
        return pizza;
    }
}
