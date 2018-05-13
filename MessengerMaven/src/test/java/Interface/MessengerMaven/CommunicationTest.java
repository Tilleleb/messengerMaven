package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.Test;
import Implementation.MessengerMaven.CommunicationImpl;

public class CommunicationTest {

	Communication service = new CommunicationImpl();
	
	// Tests for send message
	// --------------------------------------------------------------
	@Test
	public void testForAllOkSend() {
		// 1. Arrange
		String text = "text";
		int user = 1;
		int chat = 1;

		// 2. Act
		boolean bool = service.sendMessage(text, user, chat);

		// 3. Assert
		Assert.assertTrue(bool);
	}
	
	@Test
	public void testForChatNotOkSend() {
		Assert.assertFalse(service.sendMessage("text", 1, -1));
	}
	
	@Test
	public void testForUserNotOkSend() {
		Assert.assertFalse(service.sendMessage("text", -1, 1));
	}
	
	@Test
	public void testForTextEmptySend() {
		Assert.assertFalse(service.sendMessage("", 1, 1));
	}
	
	
	// Tests for receive message
	// --------------------------------------------------------------
	@Test
	public void testForAllOkReceive() {
		Assert.assertNotNull(service.recieveMessage(1));
	}
	
	@Test
	public void testForUserNotOkReceive() {
		Assert.assertNull(service.recieveMessage(0));
	}
}
