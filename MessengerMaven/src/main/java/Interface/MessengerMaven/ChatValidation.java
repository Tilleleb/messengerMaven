package Interface.MessengerMaven;

public interface ChatValidation {

	/**
	 * checks if a chat with the given id exists
	 * @param id of the chat
	 * @return true: chat exists; false: chat doesn't exist
	 */
	public boolean chatIfChatExists(int chat_id);
	

}
