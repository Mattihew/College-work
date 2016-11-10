/**
 * 
 */
package playground;

/**
 * @author Matt
 *
 */
public class Corvette
{
	private static final double DRAG_COEF = 0.4257;
	
	private static final double ROLLING_RESISTANCE_COEF = 12.8;
	
	private static final double[] GEARS= {2.66, 1.78, 1.3, 1, 0.74, 0.5};
	
	private static final double DIFF_RATIO = 3.42;
	
	private static final double TRANSMISSION_EFFICIENCY = 0.7;
	
	private static final double WHEEL_RADIUS = 0.34; // meters
	
	private static final double MAX_ENGINE_TORQUE = 475; //Newton meters
	
	private static final double MAX_ENGINE_TORQUE_SPEED = 4400; //RPM
	
	private static final double CAR_MASS = 1500; //KG
	
	/**
	 * @param args
	 */
	public static void main(final String[] args)
	{
		Corvette corvette = new Corvette();
		final double startVel = 0;
		final double endVel = 13.4112;
		final double drivingForce = corvette.drivingForce(Corvette.MAX_ENGINE_TORQUE, Corvette.GEARS[5]);
		final double force = drivingForce + corvette.dragForce((startVel + endVel) / 2) + corvette.rollingResistanceForce((startVel + endVel) / 2);
		System.out.println(force);
		final double accel = corvette.getAcceleration(drivingForce, Corvette.CAR_MASS);
		System.out.println(accel);
		final double time = corvette.getTime(startVel, endVel, accel);
		System.out.println(time);
		
		
	}
	
	public double dragForce(final double velocity)
	{
		return -Corvette.DRAG_COEF * velocity * Math.abs(velocity);
	}
	
	public double rollingResistanceForce(final double velocity)
	{
		return -Corvette.ROLLING_RESISTANCE_COEF * velocity;
	}

	public double drivingForce(final double engineTorque, final double gearRatio)
	{
		return engineTorque * gearRatio * Corvette.DIFF_RATIO * Corvette.TRANSMISSION_EFFICIENCY / Corvette.WHEEL_RADIUS;
	}
	
	public double getAcceleration(final double force, final double mass)
	{
		return force / mass;
	}
	
	public double getTime(final double startSpeed, final double endSpeed, final double acceleration)
	{
		return (endSpeed - startSpeed) / acceleration;
	}
}
