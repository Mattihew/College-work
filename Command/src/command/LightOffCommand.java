package command;

import invoker.Light;

public class LightOffCommand implements Command
{
	private final Light light;
	private boolean oldState;
	
	public LightOffCommand(final Light light)
	{
		this.light = light;
		
	}
	
	@Override
	public void execute()
	{
		this.oldState = light.isOn();
		this.light.off();
	}

	@Override
	public void undo()
	{
		if (this.oldState)
		{
			this.light.on();
		}
	}
}
