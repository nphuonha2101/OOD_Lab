package Abstract_Factory;

import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Verggie> verggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("-----------" + this.name + "-----------");

        if (dough != null)
            result.append("Dought " + this.dough.toString() + "\n");
        if (sauce != null)
            result.append("Sauce " + this.sauce.toString() + "\n");
        if (!verggies.isEmpty())
            for (Verggie verggies: verggies
                 ) {
            result.append("Verggie " + this.verggies.toString() + "\n");
            }
        if (cheese != null)
            result.append("Cheese " + this.cheese.toString() + "\n");
        if (pepperoni != null)
            result.append("Pepperoni " + this.pepperoni.toString() + "\n");
        if (clam != null)
            result.append("Clam" + this.clam.toString() + "\n");

        return result.toString();
    }
}
