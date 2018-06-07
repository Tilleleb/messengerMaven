package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import Implementation.MessengerMaven.GetUserImpl;

/**
 * Unit test for simple App.
 */
public class GetUserTest {

	static GetUser service;

    @BeforeClass
    public static void initialize() {
    	service = new GetUserImpl(); 
     }

	
	@Test
	public void testOkGetUser() {
		Assert.assertEquals(1,service.getUser("user1"));
	}
	
	@Test
	public void testNoUserFoundGetUser() {
		Assert.assertEquals(0,service.getUser("user0"));
	}
	

}
