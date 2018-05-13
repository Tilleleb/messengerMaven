package Interface.MessengerMaven;

import org.junit.Assert;
import org.junit.Test;
import Implementation.MessengerMaven.ManageContactListImpl;

public class ManageContactListTest {

	ManageContactList service = new ManageContactListImpl();

	// Test AddContact

	@Test
	public void testOkAddUser() {
		Assert.assertTrue(service.addContact(1,"user2"));
	}
	
	@Test
	public void testUserDoesntExistAddUser() {
		Assert.assertFalse(service.addContact(3,"user2"));
	}	
	
	@Test
	public void testContactDoesntExistAddUser() {
		Assert.assertFalse(service.addContact(1,"user3"));
	}
	
	@Test
	public void testSelfAddingAddUser() {
		Assert.assertFalse(service.addContact(1,"user1"));
	}
	
	// Test Delete Contact
	
	@Test
	public void testOkDeleteContact() {
		Assert.assertTrue(service.deleteContact(1,2));
	}
	
	@Test
	public void testUserDoesntExistDeleteContact() {
		Assert.assertFalse(service.deleteContact(3,2));
	}	
	
	@Test
	public void testContactDoesntExistDeleteContact() {
		Assert.assertFalse(service.deleteContact(1,3));
	}
	
	@Test
	public void testSelfAddingDeleteContact() {
		Assert.assertFalse(service.deleteContact(1,1));
	}
	
	
	// Test GetContactList
	@Test
	public void testOkGetContactlost() {
		Assert.assertNotNull(service.getContactList(1));
	}
	
	@Test
	public void testNoContactListGetContactlost() {
		Assert.assertNull(service.getContactList(0));
	}
	
}
