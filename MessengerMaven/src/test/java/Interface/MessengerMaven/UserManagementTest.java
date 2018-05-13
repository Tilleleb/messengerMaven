package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.Test;
import Implementation.MessengerMaven.UserManagementImpl;

public class UserManagementTest {

	UserManagement service = new UserManagementImpl();

	// Test addUser
	
	@Test
	public void testOkAddUser() {
		Assert.assertEquals(0,service.addUser("user0", "password0"));
	}
	
	@Test
	public void testAlreadyExistAddUser() {
		Assert.assertEquals(1,service.addUser("user1", "password1"));
	}
	
	@Test
	public void testErrorAddUser() {
		Assert.assertEquals(2,service.addUser("user2", "password2"));
	}
	
	// Test delete User
	
	@Test
	public void testOkDeleteUser() {
		Assert.assertTrue(service.deleteUser(1));
	}
	
	@Test
	public void testErrorDeleteUser() {
		Assert.assertFalse(service.deleteUser(0));
	}
	
	
	// test update User

	@Test
	public void testOkUpdateUser() {
		Assert.assertTrue(service.updateUser(1, "user1", "password1"));
	}
	
	@Test
	public void testWrongUserUpdateUser() {
		Assert.assertFalse(service.updateUser(0, "user1", "password1"));
	}
	
	@Test
	public void testEmptyPwUpdateUser() {
		Assert.assertFalse(service.updateUser(1, "user1", ""));
	}
	
	@Test
	public void testEmptyUsernameUpdateUser() {
		Assert.assertFalse(service.updateUser(1, "", "password1"));
	}
	
	@Test
	public void testWrongSignsUpdateUser() {
		Assert.assertFalse(service.updateUser(1, "user1%", "password1"));
	}
	
	
	// test loginUser
	//public int loginUser(String username, String password);
	
	@Test
	public void testOkLoginUser() {
		Assert.assertEquals(1, service.loginUser("user1", "password1"));
	}
	
	@Test
	public void testNoMatchLoginUser() {
		Assert.assertEquals(0, service.loginUser("user0", "password0"));
	}
	
}
