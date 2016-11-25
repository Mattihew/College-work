package command;

public class AndCommand implements Command
{
	private Command[] commands;
	
	public AndCommand(final Command... commands)
	{
		this.commands = commands;
	}
	
	@Override
	public void execute()
	{
		for (int i = 0; i < this.commands.length; i++)
		{
			this.commands[i].execute();
		}
	}

	@Override
	public void undo()
	{
		for (int i = this.commands.length - 1; i >= 0; i--)
		{
			this.commands[i].undo();
		}
	}

}
