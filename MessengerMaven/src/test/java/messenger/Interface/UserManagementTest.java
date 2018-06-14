package messenger.Interface;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import messenger.Implementation.UserManagementImpl;
import messenger.Interface.UserManagement;

public class UserManagementTest {

	UserManagement service;
	
    @Before
    public void initialize() {
    	service = new UserManagementImpl();
     }


	// Test addUser
	
	@Test
	public void testOkAddUser() {
		Assert.assertEquals(0,service.addUser("user1", "password1"));
	}
	
	@Test
	public void testAlreadyExistAddUser() {
		service.addUser("user1", "password1");
		Assert.assertEquals(1,service.addUser("user1", "password1"));
	}
	
	@Test
	public void testErrorAddUser() {
		Assert.assertEquals(2,service.addUser("user2", "password2"));
	}
	
	// Test delete User
	
	@Test
	public void testOkDeleteUser() {
		service.addUser("user1", "password1");
		Assert.assertTrue(service.deleteUser(1));
	}
	
	@Test
	public void testErrorDeleteUser() {
		Assert.assertFalse(service.deleteUser(0));
	}
	
	
	// test update User

	@Test
	public void testOkUpdateUser() {
		service.addUser("user1", "password1");
		Assert.assertTrue(service.updateUser(1, "user1", "password1"));
	}
	
	@Test
	public void testWrongUserUpdateUser() {
		service.addUser("user1", "password1");
		Assert.assertFalse(service.updateUser(0, "user1", "password1"));
	}
	
	@Test
	public void testEmptyPwUpdateUser() {
		service.addUser("user1", "password1");
		Assert.assertFalse(service.updateUser(1, "user1", ""));
	}
	
	@Test
	public void testEmptyUsernameUpdateUser() {
		service.addUser("user1", "password1");
		Assert.assertFalse(service.updateUser(1, "", "password1"));
	}
	
	@Test
	public void testWrongSignsUpdateUser() {
		service.addUser("user1", "password1");
		Assert.assertFalse(service.updateUser(1, "user1%", "password1"));
	}
	
	
	// test loginUser
	//public int loginUser(String username, String password);
	
	@Test
	public void testOkLoginUser() {
		service.addUser("user1", "password1");
		Assert.assertEquals(1, service.loginUser("user1", "password1"));
	}
	
	@Test
	public void testNoMatchLoginUser() {
		service.addUser("user1", "password1");
		Assert.assertEquals(0, service.loginUser("user0", "password0"));
	}
	
}
