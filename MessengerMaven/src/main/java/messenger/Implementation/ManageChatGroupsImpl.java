package messenger.Implementation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.ManageChatGroups;

@Service
@Scope("singleton")
public class ManageChatGroupsImpl implements ManageChatGroups {

	public boolean addConversation(String name, byte[] picture) {
		// TODO Auto-generated method stub
		if (picture != null) {
			if (name == "chatName" && picture[0] == 1) return true;
		}
		return false;
	}

	public boolean deleteConveration(int chat_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1) return true;
		return false;
	}

	public boolean updateConversation(int chat_id, String name, byte[] picture) {
		// TODO Auto-generated method stub
		if (picture != null) {
			if (chat_id == 1 && name == "chatName" && picture[0] == 1) return true;
		}
		return false;
	}

	public String[][] getAllConversations(int user_id) {
		// TODO Auto-generated method stub
		String[][] strArray = new String[1][1];
		if (user_id == 1) return strArray;
		return null;
	}

	public boolean addUserToConversation(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1 && user_id == 2) return true;
		return false;
	}

	public boolean deleteUserFromConversation(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1 && user_id == 2) return true;
		return false;
	}

	public boolean grantAdminPermission(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1 && user_id == 2) return true;
		return false;
	}

	public boolean revokeAdminPermission(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1 && user_id == 2) return true;
		return false;
	}

}
