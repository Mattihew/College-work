import command.AndCommand;
import command.Command;
import command.GarageDoorCloseCommand;
import command.GarageDoorOpenCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import invoker.GarageDoor;
import invoker.Light;
import remote.Remote;

public class Main {

	public static void main(String[] args) {
		Remote remote = new Remote();
		GarageDoor door = new GarageDoor();
		Light light = new Light();
		Command doorOpenCommand = new GarageDoorOpenCommand(door);
		Command doorCloseCommand = new GarageDoorCloseCommand(door);
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		Command lightsOnAndDoorOpenCommand = new AndCommand(new LightOnCommand(light), new GarageDoorOpenCommand(door));
		remote.addCommand(0, doorOpenCommand);
		remote.addCommand(1, doorCloseCommand);
		remote.addCommand(2, lightOnCommand);
		remote.addCommand(3, lightOffCommand);
		remote.addCommand(4, lightsOnAndDoorOpenCommand);
		remote.buttonWasPressed(0);
		remote.buttonWasPressed(1);
		remote.undo();
		remote.undo();
		remote.buttonWasPressed(2);
		remote.buttonWasPressed(4);
		remote.undo();
		remote.redo();
	}

}
