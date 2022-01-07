package strategyExample;

public class demoAnimalStrategy {

	public static void main(String[] args) {
		
		Animal jet = new Dog();
		Animal tweety = new Bird();
		
		System.out.println(jet.getSound() + jet.tryToFly());
		System.out.println(tweety.getSound() + tweety.tryToFly());
		
		jet.setFlyingBehaviour(new Flys());
		System.out.println("I am a dog but " + jet.tryToFly());
	}
}
