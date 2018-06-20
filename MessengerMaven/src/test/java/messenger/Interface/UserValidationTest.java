package messenger.Interface;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import messenger.Implementation.UserValidationImpl;
import messenger.Interface.UserValidation;

public class UserValidationTest {

	UserValidation service;
	
    @Before
    public void initialize() {
    	service = new UserValidationImpl();
     }

	@Test
	public void testUserExist() {
		Assert.assertTrue(service.checkIfUserExists((long) 1));
	}
	
	@Test
	public void testUserDontExist() {
		Assert.assertFalse(service.checkIfUserExists((long) 0));
	}
	

}
