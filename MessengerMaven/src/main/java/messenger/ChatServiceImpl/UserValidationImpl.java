package messenger.ChatServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.UserValidation;
import messenger.DbService.UserService;

@Service
@Scope("singleton")
public class UserValidationImpl implements UserValidation {
	
	@Autowired
    private UserService userDbService; 

	@Transactional
	public boolean checkIfUserExists(Long userId){
		if(userDbService.getUserById(userId) == null){
			return false;
		}
		return true;
	}

}
