package Simple_Factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza result = null;
        switch (type) {
            case "Cheese": {
                result = new CheesePizza();
                break;
            }
            case "Clam": {
                result = new ClamPizza();
                break;
            }
            case "Verggie": {
                result = new VerggiePizza();
                break;
            }
        }
//        return result;

//        if (type.equalsIgnoreCase("cheese"))
//            result = new NYStyleCheesePizza();
//        if (type.equalsIgnoreCase("clam"))
//            result = new NYStyleClamPizza();
//        if (type.equalsIgnoreCase("verggie"))
//            result = new NYStyleVerggiePizaa();
//
        return result;
    }

}
