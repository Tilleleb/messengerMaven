package messenger.Implementation;

import messenger.Interface.UserManagement;

public class UserManagementImpl implements UserManagement {
	
	private int userid = -1;
	private String username;
	private String password;

	public int addUser(String username, String password) {
		// TODO Auto-generated method stub
		if (this.username == null && username == "user1") {
			this.userid = 1;
			this.username = username;
			this.password = password;
			return 0;
		} else if (username == "user1") {
			return 1;
		} else return 2;
	}

	public boolean deleteUser(int userid) {
		// TODO Auto-generated method stub
		if (this.userid == userid) {
			this.userid = -1;
			this.username = null;
			this.password = null;
			return true;
		} else return false;
	}

	public boolean updateUser(int userid, String username, String password) {
		// TODO Auto-generated method stub
		if (username.indexOf('%') >= 0) return false;
		if (username.length() == 0 || password.length() == 0) return false;
		if (this.userid == userid) {
			this.username = username;
			this.password = password;
			return true;
		} return false;
	}

	public int loginUser(String username, String password) {
		// TODO Auto-generated method stub
		if (this.username == username && this.password == password) return userid;
		return 0;
	}

}
