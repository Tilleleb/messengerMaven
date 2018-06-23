package messenger.DbServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.DbService.MessageService;
import messenger.Domain.ChatConversation;
import messenger.Domain.Message;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class MessageServiceImpl implements MessageService {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}
	
	public <T> void persistObject(T entity) {
		em.persist(entity);
	}

	public <T> void removeObject(T entity) {
		entity = em.merge(entity);
		em.remove(entity);
	}

	public <T> void mergeObject(T entity) {
		em.merge(entity);
	}

	@Override
	public String[][] recieveMessage(Long chatId) {
		// TODO Auto-generated method stub
		return null;
	}
}