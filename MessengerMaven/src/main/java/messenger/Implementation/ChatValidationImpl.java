package messenger.Implementation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.ChatValidation;

@Service
@Scope("singleton")
public class ChatValidationImpl implements ChatValidation {

	public boolean checkIfChatExists(int chat_id) {
		// TODO Auto-generated method stub
		if (chat_id == 1) return true;
		return false;
	}

}
