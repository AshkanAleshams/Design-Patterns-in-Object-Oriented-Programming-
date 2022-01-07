package strategyExample;

public class Dog extends Animal {
	
	public Dog() {
		super();
		flyBehaviour = new CantFly();
		this.setSound("Woof!");
	}
	
	public void digHole() {
		System.out.println("Digging a hole");
	}

}
