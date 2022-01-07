package observerExample;

import observable.Observer;
import observable.Observable;

public class MailingListSubscriber implements Observer{

	private Observable subject;
	private String emailData;
	
	public MailingListSubscriber(Observable subject) {
		this.subject = subject;
		this.subject.register(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.emailData = 
				((MailingListPublisher) this.subject).getNewEmail();
		System.out.println("Just got new mail!");
	}

	public String getEmailData() {
		return this.emailData;
	}
}
