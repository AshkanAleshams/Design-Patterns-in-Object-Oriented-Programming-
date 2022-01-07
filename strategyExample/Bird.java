package strategyExample;

public class Bird extends Animal {
	
	public Bird() {
		super();
		flyBehaviour = new Flys();
		this.setSound("chirp!");
	}
	
	public void makeNest() {
		System.out.println("Making a nest");
	}

}
