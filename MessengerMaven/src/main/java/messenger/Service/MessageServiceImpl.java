package messenger.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Domain.ChatConversation;
import messenger.Domain.Message;
import messenger.Domain.User;

@Service
@Scope("singleton")
@Transactional
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
	public boolean sendMessage(String txt, int user_id, int chat_id) {
//		// TODO Auto-generated method stub
//		TypedQuery<ChatConversation> query = em.createQuery("SELECT chat FROM ChatConversation chat WHERE chat.chatId = :chatId", ChatConversation.class);
//		query.setParameter("chatId", chat_id);
//        em.remove(query.getSingleResult());
//		return true;		
//		
//		
//		Message message = new Message();
//		message.set
	return false;
	}

	@Override
	public String[][] recieveMessage(int chat_id) {
		// TODO Auto-generated method stub
		return null;
	}
}