package messenger.Service;

import java.util.List;
import java.io.Serializable;
import java.util.AbstractMap.SimpleEntry;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.Domain.User;

@Service
@Scope("singleton")
public class UserServiceImpl implements UserService, Serializable {

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
	public List<SimpleEntry<Long, String>> getAllUsers() {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user", User.class);
		query.getResultList();
        return null;
	}
	
	
	//GETUSER
	@Transactional
	public User getUserById(Long userId) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.userId = :userid", User.class);
		query.setParameter("userid", userId);
		 try{
			 	return query.getSingleResult();
			 } catch (NoResultException nre) {
			    return null;
			 }
		
	}
	
	
	@Transactional
	public User getUserByName(String username) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.username = :username", User.class);
		query.setParameter("username", username);
		 try{
			 	return query.getSingleResult();
			 } catch (NoResultException nre) {
			    return null;
			 }
		
	}
	
}