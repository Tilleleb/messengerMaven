package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GetUserTest {

	GetUser service = new GetUserImpl();


	
	@Test
	public void testOkGetUser() {
		Assert.assertEquals(1,service.getUser("user1"));
	}
	
	@Test
	public void testNoUserFoundGetUser() {
		Assert.assertEquals(0,service.getUser("user0"));
	}
	

}
