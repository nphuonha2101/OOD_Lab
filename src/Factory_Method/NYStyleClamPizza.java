package Factory_Method;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        this.name = "NY Style Clam Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Fresh Clams from Long Island Sound");
    }
}
