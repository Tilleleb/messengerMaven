package messenger.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.Domain.User;
import messenger.Interface.GetUser;
import messenger.Service.UserService;

@Service
@Scope("singleton")
public class GetUserImpl implements GetUser {

	@Autowired
    private UserService userservice;
	
	// return -1 wenn kein user gefunden
	@Transactional
	public Long getUser(String username) {
		User user = userservice.getUserByName(username);
		if(user == null) {
			return (long) -1;
		}
		return user.getUserId();
	}

}
