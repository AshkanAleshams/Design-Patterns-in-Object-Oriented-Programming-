package commandExample;

import java.util.ArrayList;
import java.util.List;

//Does the commands passed onto it when press() is called
public class DeviceButtonInvoker {

	List<Command> commands;
	
	public DeviceButtonInvoker() {
		this.commands = new ArrayList<Command>();
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void pressAll() {
		
		for (Command command: commands) {
			command.execude();
		}
	}
}
