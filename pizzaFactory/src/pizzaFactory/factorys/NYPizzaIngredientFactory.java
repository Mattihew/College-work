package pizzaFactory.factorys;

import java.util.Arrays;
import java.util.Collection;

import pizzaFactory.factorys.interfaces.PizzaIngredientFactory;
import pizzaFactory.ingredients.FreshClam;
import pizzaFactory.ingredients.Garlic;
import pizzaFactory.ingredients.MarinaraSouce;
import pizzaFactory.ingredients.Mushroom;
import pizzaFactory.ingredients.Onion;
import pizzaFactory.ingredients.RedPepper;
import pizzaFactory.ingredients.ReggianoCheese;
import pizzaFactory.ingredients.ThinCrustDough;
import pizzaFactory.ingredients.interfaces.Cheese;
import pizzaFactory.ingredients.interfaces.Clam;
import pizzaFactory.ingredients.interfaces.Dough;
import pizzaFactory.ingredients.interfaces.Pepperoni;
import pizzaFactory.ingredients.interfaces.Souce;
import pizzaFactory.ingredients.interfaces.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Souce createSouce() {
		return new MarinaraSouce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Collection<Veggie> createVeggies() {
		return Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
	}

	@Override
	public Pepperoni createPepperoni() {
		return new pizzaFactory.ingredients.Pepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

}
