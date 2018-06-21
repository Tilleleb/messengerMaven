package messenger.DbServiceImpl;

import java.util.List;

import java.util.ArrayList;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.DbService.UserService;
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

	public List<String> getAllUsers() {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user", User.class);
		List<User> userlist = query.getResultList();
		List<String> users = new ArrayList<String>();
		for( User user: userlist )
		{
			users.add(user.getUsername());
		}
        return users;
	}
	
	
	//GETUSER
	public User getUserById(Long userId) {
		TypedQuery<User> query = em.createQuery("SELECT user FROM User user WHERE user.userId = :userid", User.class);
		query.setParameter("userid", userId);
		 try{
			 	return query.getSingleResult();
			 } catch (NoResultException nre) {
			    return null;
			 }
	}
	
	
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