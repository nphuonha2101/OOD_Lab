package simple_factory;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        this.name = "Clam Pizza";
        this.dough = "Thin Crust";
        this.sauce = "White Garlic Sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
