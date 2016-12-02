package devices;

import devices.interfaces.InputDevice;

public class Projector
{
	public void on()
	{
		System.out.println("Projector On");
	}
	
	public void setInput(InputDevice input)
	{
		System.out.println("Projector input switched to: " + input.name());
	}
	
	public void setWideScreenMode()
	{
		System.out.println("Set to widescreen mode");
	}
}
