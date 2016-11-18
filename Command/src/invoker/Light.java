package invoker;

public class Light
{
	private boolean isOn = false;
	
	public void on()
	{
		System.out.println("Light on");
		this.isOn = true;
	}
	
	public void off()
	{
		System.out.println("Light off");
		this.isOn = false;
	}
	
	public boolean isOn()
	{
		return this.isOn;
	}
}
