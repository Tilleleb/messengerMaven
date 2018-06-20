package messenger.Implementation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Interface.Communication;

@Service
@Scope("singleton")
public class CommunicationImpl implements Communication {
	
    @PersistenceContext
	private EntityManager em;

	public boolean sendMessage(String txt, int user_id, int chat_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public String[][] recieveMessage(int chat_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
