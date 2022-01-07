package singletonExample;

public class demoScrableThreads {

	public static void main(String[] args) {
		
		ScrableWorker w1 = new ScrableWorker();
		ScrableWorker w2 = new ScrableWorker();
		
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);
		
		t1.start();
		t2.start();
		
	}
}
