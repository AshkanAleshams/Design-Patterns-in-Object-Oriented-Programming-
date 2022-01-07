package commandExample;

public class TurnVolumeUP implements Command {

	ElectronicDeviceReciever theDevice;
	
	public TurnVolumeUP(ElectronicDeviceReciever newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execude() {
		this.theDevice.volumeUp();
		
	}

	
}
