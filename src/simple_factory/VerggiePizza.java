package simple_factory;

public class VerggiePizza extends Pizza {
    public VerggiePizza() {
        this.name = "NYStyleVerggiePizaa";
        this.dough = "Crust";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Shredded mozzarella");
        this.toppings.add("Grated parmesan");
        this.toppings.add("Diced onion");
        this.toppings.add("Sliced mushrooms");
        this.toppings.add("Sliced red pepper");
        this.toppings.add("Sliced black olives");
    }
}
