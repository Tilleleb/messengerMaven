package messenger.DbServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.DbService.ConversationService;
import messenger.Domain.ChatConversation;
import messenger.Domain.GroupConversation;
import messenger.Domain.User;
import messenger.Domain.UserChat;

@Service
@Scope("singleton")
@Transactional
public class ConversationServiceImpl implements ConversationService{

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
	public boolean addContact(int userid, int contactid) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteContact(int userid, int contactid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] getContactList(int userid) {
		
		return null;
	}

	@Override
	public boolean checkIfChatExists(int chat_id) {
		TypedQuery<ChatConversation> query = em.createQuery("SELECT chat FROM ChatConversation chat WHERE chat.chatId = :chatId", ChatConversation.class);
		query.setParameter("chatId", chat_id);
        ChatConversation tmpChat = query.getSingleResult();
        if (tmpChat != null) {
        	return true;
        } 
		return false;
	}

	@Override
	public boolean addConversation(String name, byte[] picture) {
		GroupConversation groupChat = new GroupConversation();
		groupChat.setName(name);
		persistObject(groupChat);
		return false;
	}

	@Override
	public boolean deleteConveration(int chat_id) {
		TypedQuery<GroupConversation> query = em.createQuery("SELECT chat FROM GroupConversation chat WHERE chat.chatId = :chatId", GroupConversation.class);
		query.setParameter("chatId", chat_id);
		GroupConversation tmpChat = query.getSingleResult();
        removeObject(tmpChat);
		return true;
	}

	@Override
	public boolean updateConversation(int chat_id, String name, byte[] picture) {
		TypedQuery<GroupConversation> query = em.createQuery("SELECT chat FROM GroupConversation chat WHERE chat.chatId = :chatId", GroupConversation.class);
		query.setParameter("chatId", chat_id);
		GroupConversation tmpChat = query.getSingleResult();
		tmpChat.setName(name);
		return false;
	}

	@Override
	public String[][] getAllConversations(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUserToConversation(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserFromConversation(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean grantAdminPermission(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revokeAdminPermission(int chat_id, int user_id) {
		// TODO Auto-generated method stub
		return false;
	}
}