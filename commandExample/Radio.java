package commandExample;

public class Radio implements ElectronicDeviceReciever {

	private int volume = 0;
	
	
	@Override
	public void on() {
		
		System.out.println("Radio is on!");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Radio is off!");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		this.volume = volume +1;
		System.out.println("Radio volume is at" + this.volume);
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		this.volume = volume -1;
		System.out.println("Radio volume is at" + this.volume);
	}

}
