package remote;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import command.Command;

public class Remote {
	private Map<Integer, Command> slots;
	private Stack<Command> undoActions;
	private Stack<Command> redoActions;
	public Remote()
	{
		this.slots = new HashMap<>();
		this.undoActions = new Stack<>();
		this.redoActions = new Stack<>();
	}
	
	public void addCommand(final Integer buttonNumber, final Command command)
	{
		this.slots.put(buttonNumber, command);
	}
	
	public void buttonWasPressed(final Integer buttonNumber)
	{
		final Command activeCommand = this.slots.get(buttonNumber);
		activeCommand.execute();
		this.undoActions.push(activeCommand);
		this.redoActions.clear();
	}
	
	public void undo()
	{
		final Command activeCommand = this.undoActions.pop();
		activeCommand.undo();
		this.redoActions.push(activeCommand);
	}
	
	public void redo()
	{
		final Command activeCommand = this.redoActions.pop();
		activeCommand.execute();
		this.undoActions.push(activeCommand);
	}
}
