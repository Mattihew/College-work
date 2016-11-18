package command;

import invoker.Light;

public class LightOnCommand implements Command
{
	private final Light light;
	private boolean oldState;
	
	public LightOnCommand(final Light light)
	{
		this.light = light;
		
	}
	
	@Override
	public void execute()
	{
		this.oldState = light.isOn();
		this.light.on();
	}

	@Override
	public void undo()
	{
		if (!this.oldState)
		{
			this.light.off();
		}
	}
}
