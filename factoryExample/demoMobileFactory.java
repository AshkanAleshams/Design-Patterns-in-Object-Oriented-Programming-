package factoryExample;

public class demoMobileFactory {

	public static void main(String[] args) {
		
		
		Mobile p1 = MobileFactory.createMobile("iPhone");
		Mobile p2 = MobileFactory.createMobile("Samsung");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
