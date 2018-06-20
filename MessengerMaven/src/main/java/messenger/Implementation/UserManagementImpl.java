package messenger.Implementation;

import java.util.AbstractMap.SimpleEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

import messenger.Interface.UserManagement;
import messenger.Service.UserService;


@Service
@Scope("singleton")
public class UserManagementImpl implements UserManagement {
	 
    @Autowired
    private UserService userservice;  // = new UserServiceImpl();
    
	public int addUser(String username, String password) {
    	if (isOkUsername(username) && isOkPassword(password)) {
    		if (userservice.getUser(username) != -1) {
    			return userservice.addUser(username,password);
    		} else return 1;
    	}
		return 2;
	}
    
	public boolean deleteUser(int userid) {
		if (userservice.checkIfUserExists(userid)) {
			return userservice.deleteUser(userid);
		} 
		return false;
	}

	public boolean updateUser(int userid, String username, String password) {
		if (isOkUsername(username) && isOkPassword(password) && userservice.checkIfUserExists(userid)) {
			return userservice.updateUser(userid, username, password);
		}
		return false;
	}

	public int loginUser(String username, String password) {
		if (isOkUsername(username) && isOkPassword(password)) {
			return userservice.loginUser(username, password);
		}
		return 0;
	}

	public List<SimpleEntry<Long, String>> getAllUsers() {
		return userservice.getAllUsers();
	}
	
	
	private boolean isOkUsername(String username) {
		if (username == null || username.length() < 1 || username.length() > 20) {
    		return false;
    	}
		return true;
	}
	
	private boolean isOkPassword(String password) {
		if (password == null || password.length() < 1 || password.length() > 20) {
    		return false;
    	}
		return true;
	}

}
