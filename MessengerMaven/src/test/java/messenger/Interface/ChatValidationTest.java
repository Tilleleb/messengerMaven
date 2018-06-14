package messenger.Interface;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import messenger.Implementation.ChatValidationImpl;
import messenger.Interface.ChatValidation;

/**
 * Unit test for simple App.
 */
public class ChatValidationTest {

	ChatValidation service;
	
    @Before
    public void initialize() {
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
