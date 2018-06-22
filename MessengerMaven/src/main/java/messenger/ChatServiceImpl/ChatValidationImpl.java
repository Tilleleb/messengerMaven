package messenger.ChatServiceImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.ChatService.ChatValidation;

@Service
@Scope("singleton")
public class ChatValidationImpl implements ChatValidation {

	public boolean checkIfChatExists(Long chatId) {
		// TODO Auto-generated method stub

		return false;
	}

}
