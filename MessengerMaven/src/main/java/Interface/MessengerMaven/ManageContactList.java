package Interface.MessengerMaven;

public interface ManageContactList {
	
	/**
	 * adds a contact to users contacts list
	 * @param userid		id of the user
	 * @param contactid		id of the contact (a contact is also a user)
	 * @return				true: the contact was added
	 */
	public boolean addContact(int userid, int contactid);
	
	/**
	 * contact a user from a users contact list
	 * @param userid		id of the user
	 * @param contactid		id of the contact (a contact is also a user)
	 * @return              true: contact succesful deleted
	 */
	public boolean deleteContact(int userid, int contactid);
	
	/**
	 * returns an array with all the contact of a user
	 * @param userid	id of the user
	 * @return			int-array with all the contact-ids belonging to the contacts of the user
	 */
	public int[] getContactList(int userid);
	
	/*-----------------------???????????????????????----------------------------*/
	//public Contact getContact(String Username);//?
	/*-----------------------???????????????????????----------------------------*/
	
	
}
