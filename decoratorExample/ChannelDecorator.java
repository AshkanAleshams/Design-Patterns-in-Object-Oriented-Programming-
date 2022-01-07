package decoratorExample;
//the wrapper class
public abstract class ChannelDecorator implements SatelliteTV {
	//the wrappe class
	private SatelliteTV satelliteTV;
	
	// class constructor
	public ChannelDecorator(SatelliteTV satelliteTV){
		this.satelliteTV = satelliteTV;
	}
	
	public SatelliteTV getSatelliteTV() {
		return satelliteTV;
	}
}
