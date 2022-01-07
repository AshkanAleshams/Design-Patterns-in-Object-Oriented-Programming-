package commandExample;

public class TurnOn implements Command {

	ElectronicDeviceReciever theDevice;
	
	public TurnOn(ElectronicDeviceReciever newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execude() {
		this.theDevice.on();
		
	}

	
}
