package strategyExample;

public class Animal {

	FlyBehaviour flyBehaviour;
	
	private String name;
	private String sound;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String tryToFly() {
		return flyBehaviour.fly();
	}
	
	public void setFlyingBehaviour(FlyBehaviour flying) {
		this.flyBehaviour = flying;
	}
	
}
