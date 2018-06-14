package messenger.Implementation;

import messenger.Interface.UserValidation;

public class UserValidationImpl implements UserValidation {

	public boolean checkIfUserExists(int user_id) {
		// TODO Auto-generated method stub
		if (user_id == 1) return true;
		return false;
	}

}
