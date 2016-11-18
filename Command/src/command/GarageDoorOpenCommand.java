package command;

import invoker.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	private final GarageDoor garageDoor;
	private boolean oldState;
	
	public GarageDoorOpenCommand(final GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
		
	}
	
	@Override
	public void execute()
	{
		this.oldState = garageDoor.isOpen();
		this.garageDoor.open();
	}

	@Override
	public void undo()
	{
		if (!this.oldState)
		{
			this.garageDoor.close();
		}
	}
}
