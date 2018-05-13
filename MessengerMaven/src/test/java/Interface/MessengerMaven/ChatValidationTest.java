package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.Test;
import Implementation.MessengerMaven.ChatValidationImpl;

/**
 * Unit test for simple App.
 */
public class ChatValidationTest {

	ChatValidation service = new ChatValidationImpl();

	@Test
	public void testIsZero() {
		testForFalse(0);
	}
	
	@Test
	public void testChatExist() {
		testForTrue(1);
	}
	
	@Test
	public void testChatDontExist() {
		testForFalse(99);
	}
		
	public void testForTrue(int testValue) {
		Assert.assertTrue(service.chatIfChatExists(testValue));
	}
	
	public void testForFalse(int testValue) {
		Assert.assertFalse(service.chatIfChatExists(testValue));
	}
}
