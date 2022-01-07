package commandExample;

public class TurnOff implements Command {

	ElectronicDeviceReciever theDevice;
	
	public TurnOff(ElectronicDeviceReciever newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execude() {
		this.theDevice.off();
		
	}

	
}
