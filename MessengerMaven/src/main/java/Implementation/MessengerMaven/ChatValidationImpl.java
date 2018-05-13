package Implementation.MessengerMaven;

import Interface.MessengerMaven.ChatValidation;

public class ChatValidationImpl implements ChatValidation {

	public boolean chatIfChatExists(int chat_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1) return true;
		return false;
	}

}
