package Decorator.Beverages;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super("HouseBlend");
	}
	/**
	 * {@inheritDoc}
	 *
	 * @see decorator.Beverage#getCost()
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 89;
	}

}
