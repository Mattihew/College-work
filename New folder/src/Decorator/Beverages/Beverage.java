/**
 * 
 */
package Decorator.Beverages;

/**
 * @author Matt Rayner
 *
 */
abstract public class Beverage {
	private final String description;
	
	public Beverage()
	{
		this.description = "";
	}
	
	public Beverage(final String description)
	{
		this.description = description;
	}
	
	public abstract int getCost();
	
	public String getDescription()
	{
		return this.description;
	}

	@Override
	public String toString() {
		return this.description + "£" + this.getCost() / 100;
	}
}
