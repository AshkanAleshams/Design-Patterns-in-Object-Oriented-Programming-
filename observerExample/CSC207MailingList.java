package observerExample;

public class CSC207MailingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MailingListPublisher csc207Prof = new MailingListPublisher();
		MailingListSubscriber[] csc207Students = 
				new MailingListSubscriber[10];
		for (int i=0; i < 10; i++)
			csc207Students[i] = 
			new MailingListSubscriber(csc207Prof);
		csc207Prof.setNewEmail("Welcome to CSC207!");
		
	}

}
