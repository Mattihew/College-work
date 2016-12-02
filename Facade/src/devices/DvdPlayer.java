package devices;

import devices.interfaces.InputDevice;

public class DvdPlayer implements InputDevice
{
	@Override
	public String name()
	{
		return "DVD Player";
	}

	public void on()
	{
		System.out.println("DVD player turned on");
	}
	
	public void play(String movie)
	{
		System.out.println("Playing: " + movie);
	}
}
