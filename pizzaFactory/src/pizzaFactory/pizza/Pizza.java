package pizzaFactory.pizza;

import java.util.Collection;

import pizzaFactory.ingredients.interfaces.Cheese;
import pizzaFactory.ingredients.interfaces.Clam;
import pizzaFactory.ingredients.interfaces.Dough;
import pizzaFactory.ingredients.interfaces.Pepperoni;
import pizzaFactory.ingredients.interfaces.Souce;
import pizzaFactory.ingredients.interfaces.Veggie;

public abstract class Pizza {
	private String name;
	protected Dough dough;
	protected Souce souce;
	Collection<Veggie> veggies;
	Cheese cheese;
	private Pepperoni pepperoni;
	private Clam clam;
	
	public Pizza()
	{
		super();
	}
	
	public Pizza(final String name)
	{
		this();
		this.name = name;
	}
	
	abstract void prepare();
	
	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza in diagonal strips");
	}
	
	public void box()
	{
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(final String newName)
	{
		this.name = newName;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}
