package messenger.DbService;

public interface ConversationService {

	/**
	 * Generische Methode, um die übergebene Entität als Eintrag in der Datenbank
	 * zu erzeugen.
	 * 
	 * @param entity
	 *            generische Entität, welche in die Datenbank persistiert werden
	 *            soll
	 */
	public <T> void persistObject(T entity);

	/**
	 * Generische Methode, um den Eintrag der übergebenen Entität in der
	 * Datenbank zu aktualisieren.
	 * 
	 * @param entity
	 *            generische Entität, dessen Eintrag in der Datenbank
	 *            aktualisiert werden soll
	 */
	public <T> void mergeObject(T entity);

	/**
	 * Generische Methode, um den Eintrag der übergebenen Entität aus der
	 * Datenbank zu entfernen.
	 * 
	 * @param entity
	 *            generische Entität, dessen Eintrag aus der Datenbank entfernt
	 *            werden soll
	 */
	public <T> void removeObject(T entity);
	
	//ManageContactList
	public boolean addContact(int userid, int contactid);

	public boolean deleteContact(int userid, int contactid);

	public int[] getContactList(int userid);
	
	//chatValidation
	public boolean checkIfChatExists(int chat_id);
	
	//ManageChatgroups
	public boolean addConversation(String name, byte[] picture) ;

	public boolean deleteConveration(int chat_id) ;

	public boolean updateConversation(int chat_id, String name, byte[] picture);

	public String[][] getAllConversations(int user_id);

	public boolean addUserToConversation(int chat_id, int user_id) ;

	public boolean deleteUserFromConversation(int chat_id, int user_id);

	public boolean grantAdminPermission(int chat_id, int user_id);

	public boolean revokeAdminPermission(int chat_id, int user_id);

}
