package messenger.Service;

import java.util.List;
import java.util.AbstractMap.SimpleEntry;

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
public class UserServiceImpl implements UserService {

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

	@Transactional
	public int addUser(String username, String password) {
		User u1 = new User();
		u1.setUsername(username);
		u1.setPassword(password);
		em.persist(u1);
		return 0;
	}

	@Transactional
	public boolean deleteUser(int userid) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.userId = :userId", User.class);
		query.setParameter("userId", userid);
        em.remove(query.getSingleResult());
		return true;
	}

	@Transactional
	public boolean updateUser(int userid, String username, String password) {

		return true;
	}

	@Transactional
	public int loginUser(String username, String password) {
		TypedQuery<User> query = em.createQuery
				("SELECT user FROM User user WHERE user.username = :username AND user.password = :password ", User.class);
		query.setParameter("username", username);
		query.setParameter("password", password);
        return query.getSingleResult().getUserId();	
	}

	@Transactional
	public List<SimpleEntry<Long, String>> getAllUsers() {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user", User.class);
		query.getResultList();
        return;
	}
	
	
	//GETUSER
	@Transactional
	public int getUser(String username) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.username = :username", User.class);
		query.setParameter("username", username);
		return query.getSingleResult().getUserId();
	}
	
	
	//UserValidation
	@Transactional
	public boolean checkIfUserExists(int user_id) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.userId = :userId", User.class);
		query.setParameter("userId", user_id);
        User tmpUser = query.getSingleResult();
        if (tmpUser != null) {
        	return true;
        } 
		return false;
	}
}