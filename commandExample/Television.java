package commandExample;

public class Television implements ElectronicDeviceReciever {

	private int volume = 0;
	
	
	@Override
	public void on() {
		
		System.out.println("TV is on!");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is off!");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		this.volume = volume +5;
		System.out.println("TV volume is at" + this.volume);
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		this.volume = volume -5;
		System.out.println("TV volume is at" + this.volume);
	}

}
