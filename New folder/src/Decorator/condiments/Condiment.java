/**
 * 
 */
package Decorator.condiments;

import Decorator.Beverages.Beverage;

/**
 * @author Matt Rayner
 *
 */
public abstract class Condiment extends Beverage {

	Beverage bev;
	private int cost;
	private String description;
	
	public Condiment(final Beverage beverage, final int cost, final String desc) {
		super();
		this.bev = beverage;
		this.cost = cost;
		this.description = desc;
	}

	@Override
	public int getCost() {
		return bev.getCost() + this.cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return bev.getDescription() + this.description;
	}
	
}
