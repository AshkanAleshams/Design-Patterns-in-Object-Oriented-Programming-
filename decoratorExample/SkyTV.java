package decoratorExample;

public class SkyTV implements SatelliteTV {

	@Override
	public void show(int channelNumber) {
		if (channelNumber<100) {
			System.out.println("Basic News Channel");
		}
		else {
			System.out.println("You are not subscribed");
		
		}
		
	}

	@Override
	public int subcriptionPrice() {
		// TODO Auto-generated method stub
		return 100;
	}
	
}
