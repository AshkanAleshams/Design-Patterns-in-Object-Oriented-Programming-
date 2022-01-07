package singletonExample;

import java.util.LinkedList;

public class ScrableWorker implements Runnable {

	@Override
	public void run() {
		
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID:" + newInstance.hashCode());
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerTiles = newInstance.getTiles(7);
		
		System.out.println("Player tiles:" + playerTiles);
		
	}

}
