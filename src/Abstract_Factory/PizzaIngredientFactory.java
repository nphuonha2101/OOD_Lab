package Abstract_Factory;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    List<Verggie> createVerggies();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clam createClam();
}
