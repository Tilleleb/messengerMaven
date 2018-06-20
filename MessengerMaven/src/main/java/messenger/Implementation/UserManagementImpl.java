package messenger.Implementation;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import messenger.Domain.User;
import messenger.Interface.UserManagement;
import messenger.Service.UserService;


@Service
@Scope("singleton")
public class UserManagementImpl implements UserManagement {
	 
    @Autowired
    private UserService userservice;  // = new UserServiceImpl();
    @PersistenceContext
	private EntityManager em;
    

    @Transactional
	public int addUser(String username, String password) {
    	if (isOkUsername(username) && isOkPassword(password)) {
    		if (userservice.getUserByName(username) == null) {
    			User newuser = new User();
    			newuser.setUsername(username);
    			newuser.setPassword(password);
    			userservice.persistObject(newuser);
    			return 0;
    		} else return 1;
    	}
		return 2;
	}
    
    @Transactional
	public boolean deleteUser(Long userId) {
		User user = userservice.getUserById(userId);
		if (user == null) {
			return false;
		} 
		userservice.removeObject(user);
		return true;	
	}

    @Transactional
	public boolean updateUser(Long userId, String username, String password) {
		User user = userservice.getUserById(userId);
		if (isOkUsername(username) && isOkPassword(password) && user != null) {
			user.setPassword(password);
			user.setUsername(username);
			userservice.mergeObject(user);
			return true;
		}
		return false;
	}

	public int loginUser(String username, String password) {
		
	//	if (isOkUsername(username) && isOkPassword(password)) {
	//		return userservice.loginUser(username, password);
	//	}
		return 0;
	}

	public List<String> getAllUsers() {
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
