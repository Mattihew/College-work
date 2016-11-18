package remote;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import command.Command;

public class Remote {
	private Map<Integer, Command> slots;
	private Stack<Command> actions;
	public Remote()
	{
		this.slots = new HashMap<>();
		this.actions = new Stack<>();
	}
	
	public void addCommand(final Integer buttonNumber, final Command command)
	{
		this.slots.put(buttonNumber, command);
	}
	
	public void buttonWasPressed(final Integer buttonNumber)
	{
		final Command activeCommand = this.slots.get(buttonNumber);
		activeCommand.execute();
		this.actions.push(activeCommand);
	}
	
	public void undo()
	{
		this.actions.pop().undo();
	}
}
