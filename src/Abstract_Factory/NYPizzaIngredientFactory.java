package Abstract_Factory;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {

        return new ThinCustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public List<Verggie> createVerggies() {
        List<Verggie> verggies = new ArrayList<>();
        verggies.add(new Garlic());
        verggies.add(new Onion());
        verggies.add(new Mushroom());
        verggies.add(new RedPepper());

        return verggies;
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
