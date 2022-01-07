package decoratorExample;

public class DemoSatelliteTV {

	public static void main(String[] args) {
		SatelliteTV myTV = new ESPN(new CartoonNetwork(new SkyTV()));
		myTV.show(250);
		int subscriptionAmount = myTV.subcriptionPrice();
		System.out.println("Your subscription amount is: $" + subscriptionAmount);
	}
	
	
}
