package command;

import invoker.GarageDoor;

public class GarageDoorCloseCommand implements Command {

	private final GarageDoor garageDoor;
	private boolean oldState;
	
	public GarageDoorCloseCommand(final GarageDoor garageDoor)
	{
		this.garageDoor = garageDoor;
		
	}
	
	@Override
	public void execute()
	{
		this.oldState = garageDoor.isOpen();
		this.garageDoor.close();
	}

	@Override
	public void undo()
	{
		if (this.oldState)
		{
			this.garageDoor.open();
		}
	}
}
