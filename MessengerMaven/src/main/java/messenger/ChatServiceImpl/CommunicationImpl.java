package messenger.ChatServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.ChatService.Communication;

@Service
@Scope("singleton")
public class CommunicationImpl implements Communication {

	public boolean sendMessage(String txt, Long userId, Long chatId) {
		// TODO Auto-generated method stub
		return false;
	}

	public String[][] recieveMessage(Long chatId) {
		// TODO Auto-generated method stub
		return null;
	}

}
