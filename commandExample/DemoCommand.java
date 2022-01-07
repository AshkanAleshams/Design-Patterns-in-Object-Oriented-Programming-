package commandExample;

public class DemoCommand {

	public static void main(String[] args) {
		
		ElectronicDeviceReciever myTV = new Television();
		ElectronicDeviceReciever myRadio = new Radio();
		
		DeviceButtonInvoker remote = new DeviceButtonInvoker();
		
		//add all commands to remote's quoue
		remote.addCommand(new TurnOn(myTV));
		remote.addCommand(new TurnVolumeUP(myTV));
		remote.addCommand(new TurnVolumeUP(myTV));
		remote.addCommand(new TurnVolumeDown(myTV));
		remote.addCommand(new TurnOff(myTV));
		
		remote.addCommand(new TurnOn(myRadio));
		remote.addCommand(new TurnVolumeUP(myRadio));
		remote.addCommand(new TurnVolumeUP(myRadio));
		remote.addCommand(new TurnOff(myRadio));
		
		//now press all command
		remote.pressAll();
		
	}
}
