package Interface.MessengerMaven;

public interface ManageContactList {
	
	/**
	 * adds a contact to user contact list
	 * @param userid		id of the user
	 * @param contactid		id of the contact (a contact is also a user)
	 * @return				true: the contact was added
	 */
	public boolean addContact(int userid, String contactname);
	
	/**
	 * deletes a user from a user contact list
	 * @param userid unique id of the user
	 * @param contactid unique id of the contact (a contact is also a user)
	 * @return true: contact succesful deleted false: deleting of the contact failed
	 */
	public boolean deleteContact(int userid, int contactid);
	
	/**
	 * returns an array with all the contact of a user
	 * @param userid unique id of the user
	 * @return int-array with all the contact-ids belonging to the contacts of the user
	 */
	public int[] getContactList(int userid);
	
}
