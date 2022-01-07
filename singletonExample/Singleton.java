package singletonExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	//Static because we dont want it to change and wnat it to be accessed everywhere
	private static Singleton firstInstance = null;
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",}; 

	//getting a array of things inside a linkedList
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters)); 
	
	static boolean firstThread = true;
	
	//private since we dont want the user to create another object
	//dont really need constructor
	private Singleton() {}
	
	
	public static Singleton getInstance() { //We could place 'synchronized' here in method header but this slows everything down
		
		if (firstInstance == null) {
			
			
			if(firstThread) {
				
				firstThread = false;
				
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//synchronization
			synchronized(Singleton.class) {
				
				if (firstInstance == null) {
					
					firstInstance = new Singleton(); //lazy instantiation: if this object is not need, it will never get created
					
					Collections.shuffle(firstInstance.letterList); //shuffle the words
				}
			
			
			}
		}
		
		
		return firstInstance;
	}
	
	
	
	public LinkedList<String> getLetterList(){
		
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int amount) {
		
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for (int i=0; i <= amount; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		
		return tilesToSend;
	}
}
