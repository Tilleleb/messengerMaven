package messenger.Implementation;

import messenger.Interface.ChatValidation;

public class ChatValidationImpl implements ChatValidation {

	public boolean checkIfChatExists(int chat_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1) return true;
		return false;
	}

}
