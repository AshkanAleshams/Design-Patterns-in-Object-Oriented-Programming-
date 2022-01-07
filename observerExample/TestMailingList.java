package observerExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class TestMailingList {

	@Test
	void testPublisher() {
		MailingListPublisher Arts = new MailingListPublisher();
		MailingListSubscriber student1 = new MailingListSubscriber(Arts);
		Arts.setNewEmail("Hello");
		
		assertEquals("Hello", Arts.getNewEmail());
	
	}
	
	@Test
	void testSubscriber() {
		MailingListPublisher Arts = new MailingListPublisher();
		MailingListSubscriber student1 = new MailingListSubscriber(Arts);
		Arts.setNewEmail("Hello");
		
		assertEquals("Hello", student1.getEmailData());
	}

}
