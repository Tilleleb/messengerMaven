package messenger.Implementation;

import messenger.Interface.GetUser;

public class GetUserImpl implements GetUser {

	
	// return -1 wenn kein user gefunden
	public int getUser(String username) {
		// TODO Auto-generated method stub
		if ( username == "user1") return 1;
		if ( username == "user0") return 0;
		return 0;
	}

}
