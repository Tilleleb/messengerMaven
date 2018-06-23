package messenger.ChatServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.GetUser;
import messenger.DbService.UserService;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class GetUserImpl implements GetUser {

	@Autowired
    private UserService userDbService;
	
	// return -1 wenn kein user gefunden
	@Transactional
	public Long getUser(String username) {
		User user = userDbService.getUserByName(username);
		if(user == null) return -1l;
		return user.getUserId();
	}

}
