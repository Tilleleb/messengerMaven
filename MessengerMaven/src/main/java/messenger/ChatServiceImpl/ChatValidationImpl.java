package messenger.ChatServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.ChatService.ChatValidation;
import messenger.DbService.ConversationService;

@Service
@Scope("singleton")
public class ChatValidationImpl implements ChatValidation {
	
	@Autowired
	private ConversationService conversationDbService;

	public boolean checkIfChatExists(Long chatId) {
		if (conversationDbService.getChatById(chatId) == null) return false;
		return true;
	}

}
