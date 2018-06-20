package messenger.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.GetUser;
import messenger.Service.UserService;

@Service
@Scope("singleton")
public class GetUserImpl implements GetUser {

	@Autowired
    private UserService userservice;
	
	// return -1 wenn kein user gefunden
	public int getUser(String username) {
		if (username == null || username.length() < 1 || username.length() > 20) {
			return -1;
		} 
		return userservice.getUser(username);
	}

}
