package messenger.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.UserValidation;
import messenger.Service.UserService;

@Service
@Scope("singleton")
public class UserValidationImpl implements UserValidation {
	
	@Autowired
    private UserService userservice; 

	public boolean checkIfUserExists(int user_id) {
		return userservice.checkIfUserExists(user_id);
	}

}
