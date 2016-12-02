package devices;

import devices.interfaces.InputDevice;

public class Amplifier
{
	public void on()
	{
		System.out.println("Amplifier on");
	}
	
	public void setInput(InputDevice input)
	{
		System.out.println("Amplifier input set to: " + input.name());
	}
	
	public void setSurroundSound()
	{
		System.out.println("Surround sound mode");
	}
	
	public void setVolume(int volume)
	{
		System.out.println("Volume set to: " + volume);
	}
}
