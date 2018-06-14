package messenger.Interface;

public interface UserValidation {
	
	/**
	 * checks if a user exists
	 * @param user_id unique id of an user
	 * @return true: user exists; false: user doesn't exist
	 */
	public boolean checkIfUserExists(int user_id);

}