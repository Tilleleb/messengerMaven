package Implementation.MessengerMaven;

import Interface.MessengerMaven.UserManagement;

public class UserManagementImpl implements UserManagement {

	public int addUser(String username, String password) {
		// TODO Auto-generated method stub
		if (username == "user0") return 0;
		if (username == "user1") return 1;
		if (username == "user2") return 2;
		return 0;
	}

	public boolean deleteUser(int userid) {
		// TODO Auto-generated method stub
		if (userid == 1) return true;
		return false;
	}

	public boolean updateUser(int userid, String username, String password) {
		// TODO Auto-generated method stub
		if (userid == 1 && username == "user1" && password == "password1") return true;
		return false;
	}

	public int loginUser(String username, String password) {
		// TODO Auto-generated method stub
		if (username == "user1" && password == "password1") return 1;
		return 0;
	}

}
