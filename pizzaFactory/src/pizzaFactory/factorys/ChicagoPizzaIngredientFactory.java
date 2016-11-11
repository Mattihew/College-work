package pizzaFactory.factorys;

import java.util.Arrays;
import java.util.Collection;

import pizzaFactory.factorys.interfaces.PizzaIngredientFactory;
import pizzaFactory.ingredients.BlackOlives;
import pizzaFactory.ingredients.Eggplant;
import pizzaFactory.ingredients.Mozzarella;
import pizzaFactory.ingredients.PlumTomatoSouce;
import pizzaFactory.ingredients.Spinach;
import pizzaFactory.ingredients.ThinCrustDough;
import pizzaFactory.ingredients.interfaces.Cheese;
import pizzaFactory.ingredients.interfaces.Clam;
import pizzaFactory.ingredients.interfaces.Dough;
import pizzaFactory.ingredients.interfaces.Pepperoni;
import pizzaFactory.ingredients.interfaces.Souce;
import pizzaFactory.ingredients.interfaces.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Souce createSouce() {
		return new PlumTomatoSouce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Collection<Veggie> createVeggies() {
		return Arrays.asList(new Eggplant(), new Spinach(), new BlackOlives());
	}

	@Override
	public Pepperoni createPepperoni() {
		return new pizzaFactory.ingredients.Pepperoni();
	}

	@Override
	public Clam createClam() {
		return new pizzaFactory.ingredients.Clam();
	}

}
