package Interface.MessengerMaven;

public interface GetUser { 
	
	/**
	 * returns the user-id that the username belong to
	 * @param username	username for which the id is to be returned
	 * @return 			user-id that belongs to the username
	 */
	public int getUser(String username);

}
