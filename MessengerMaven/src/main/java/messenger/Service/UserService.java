package messenger.Service;

import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public interface UserService {

	/**
	 * Generische Methode, um die übergebene Entität als Eintrag in der Datenbank zu
	 * erzeugen.
	 * 
	 * @param entity
	 *            generische Entität, welche in die Datenbank persistiert werden
	 *            soll
	 */
	public <T> void persistObject(T entity);

	/**
	 * Generische Methode, um den Eintrag der übergebenen Entität in der Datenbank
	 * zu aktualisieren.
	 * 
	 * @param entity
	 *            generische Entität, dessen Eintrag in der Datenbank aktualisiert
	 *            werden soll
	 */
	public <T> void mergeObject(T entity);

	/**
	 * Generische Methode, um den Eintrag der übergebenen Entität aus der Datenbank
	 * zu entfernen.
	 * 
	 * @param entity
	 *            generische Entität, dessen Eintrag aus der Datenbank entfernt
	 *            werden soll
	 */
	public <T> void removeObject(T entity);
	
	
	//USERMANAGEMENT
	public int addUser(String username, String password);

	public boolean deleteUser(int userid);

	public boolean updateUser(int userid, String username, String password);

	public int loginUser(String username, String password);

	public List<String> getAllUsers();
	
	//GETUSER
	public int getUser(String username);
	
	//UserValidation
	public boolean checkIfUserExists(int user_id);

}
