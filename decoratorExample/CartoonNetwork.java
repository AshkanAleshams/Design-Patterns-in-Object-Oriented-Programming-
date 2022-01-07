package decoratorExample;

public class CartoonNetwork extends ChannelDecorator {

	public CartoonNetwork(SatelliteTV satelliteTV) {
		super(satelliteTV);
		// TODO Auto-generated constructor stub
	}

	public void show(int channelNumber) {
		if (channelNumber>200 && channelNumber < 300) {
			System.out.println("Enjoy Cartoons Channel");
		}
		else {
			// then get the wrappe class's channel number
			this.getSatelliteTV().show(channelNumber);
		
		}
		
	}

	public int subcriptionPrice() {
		return this.getSatelliteTV().subcriptionPrice()+5;
	}
}
