package commandExample;

public class TurnVolumeDown implements Command {

	ElectronicDeviceReciever theDevice;
	
	public TurnVolumeDown(ElectronicDeviceReciever newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execude() {
		this.theDevice.volumeDown();
		
	}

	
}
