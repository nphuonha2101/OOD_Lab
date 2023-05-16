package Simple_Factory;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

//    public Pizza(String name, String dough, String sauce, ArrayList<String> toppings) {
//        this.name = name;
//        this.dough = dough;
//        this.sauce = sauce;
//        this.toppings = toppings;
//    }

    public void prepare() {
        System.out.println("Preparing..." + name);
    }

    public void bake() {
        System.out.println("Baking..." + name);
    }

    public void cut() {
        System.out.println("Cutting..." + name);
    }

    public void box() {
        System.out.println("Moving to the box..." + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append(toppings.get(i) + "\n");

        }
        return display.toString();
    }


}
