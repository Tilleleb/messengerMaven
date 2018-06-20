package messenger.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Domain.User;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIfChatExists(int chat_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addConversation(String name, byte[] picture) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteConveration(int chat_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateConversation(int chat_id, String name, byte[] picture) {
		// TODO Auto-generated method stub
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