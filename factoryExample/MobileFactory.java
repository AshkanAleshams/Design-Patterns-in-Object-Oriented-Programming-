package factoryExample;

public class MobileFactory {

	public static Mobile createMobile(String mobileType) {
		if (mobileType.equals(Mobile.IPHONE)) {
			return new IPhone(2, "A1", "Graphics 3000", "DigiCam" );
		}
		if (mobileType.equals(Mobile.SAMSUNG)) {
			Samsung sam = new Samsung();
			sam.setGPU("Graphics 200");
			sam.setProcessor("i5");
			sam.setRamSize(2);
			
			return sam;
		}
	
		return null;
	}
}
