package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import Implementation.MessengerMaven.ChatValidationImpl;

/**
 * Unit test for simple App.
 */
public class ChatValidationTest {

	static ChatValidation service;
	
    @BeforeClass
    public static void initialize() {
    	service =  new ChatValidationImpl();
     }

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
		Assert.assertTrue(service.checkIfChatExists(testValue));
	}
	
	public void testForFalse(int testValue) {
		Assert.assertFalse(service.checkIfChatExists(testValue));
	}
}
