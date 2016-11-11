package pizzaFactory.factorys.interfaces;

import java.util.Collection;

import pizzaFactory.ingredients.interfaces.Cheese;
import pizzaFactory.ingredients.interfaces.Clam;
import pizzaFactory.ingredients.interfaces.Dough;
import pizzaFactory.ingredients.interfaces.Pepperoni;
import pizzaFactory.ingredients.interfaces.Souce;
import pizzaFactory.ingredients.interfaces.Veggie;

public interface PizzaIngredientFactory {
	Dough createDough();
	Souce createSouce();
	Cheese createCheese();
	Collection<Veggie> createVeggies();
	Pepperoni createPepperoni();
	Clam createClam();
}
