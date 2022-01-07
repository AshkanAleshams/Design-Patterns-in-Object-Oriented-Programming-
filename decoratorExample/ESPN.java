package decoratorExample;

//concrete ChannelDecorator
public class ESPN extends ChannelDecorator{

	public ESPN(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}
	
	public void show(int channelNumber) {
		if (channelNumber>100 && channelNumber < 200) {
			System.out.println("Enjoy Sports Channel");
		}
		else {
			// then get the wrappe class's channel number
			this.getSatelliteTV().show(channelNumber);
		
		}
		
	}

	public int subcriptionPrice() {
		return this.getSatelliteTV().subcriptionPrice()+7;
	}

}
