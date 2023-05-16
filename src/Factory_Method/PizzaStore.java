package Factory_Method;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese": {
                pizza = this.createPizza("cheese");
                break;
            }
            case "clam": {
                pizza = this.createPizza("clam");
                break;
            }
            case "verggies": {
                pizza = this.createPizza("verggies");
                break;
            }
        }
        return pizza;
    }
}
