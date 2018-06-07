package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import Implementation.MessengerMaven.UserValidationImpl;

public class UserValidationTest {

	static UserValidation service;
	
    @BeforeClass
    public static void initialize() {
    	service = new UserValidationImpl();
     }

	@Test
	public void testUserExist() {
		Assert.assertTrue(service.checkIfUserExists(1));
	}
	
	@Test
	public void testUserDontExist() {
		Assert.assertFalse(service.checkIfUserExists(0));
	}
	

}
