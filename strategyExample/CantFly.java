package strategyExample;

public class CantFly implements FlyBehaviour {

	@Override
	public String fly() {
		return "I cant fly bro";
	}
	
}
