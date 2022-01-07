package singletonExample;

import java.util.LinkedList;

public class demoScrabbleGame {

	public static void main(String[] args) {
		
		Singleton newInstance = Singleton.getInstance();
		
		//making sure we only have one object
		System.out.println("Instance 1 ID:" + newInstance.hashCode());
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> player1Tiles = newInstance.getTiles(7);
		
		System.out.println("Player 1:" + player1Tiles);
		
		//see what the letters look like after player1
		System.out.println(newInstance.getLetterList());
		
		Singleton instanceTwo = Singleton.getInstance();
		//making sure we only have one object
		System.out.println("Instance 2  ID:" + instanceTwo.hashCode());
		

		//see what the letters look like after player1
		System.out.println(instanceTwo.getLetterList());
	
		
		LinkedList<String> player2Tiles = newInstance.getTiles(7);
		
		System.out.println("Player 2:" + player2Tiles);
		

		//see what the letters look like after player2
		System.out.println(instanceTwo.getLetterList());
	}
}
