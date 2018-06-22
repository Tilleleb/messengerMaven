package messenger.ChatServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ManageContactList;
import messenger.DbService.UserService;
import messenger.Domain.User;

@Service
@Scope("singleton")
public class ManageContactListImpl implements ManageContactList {

	@Autowired
    private UserService userService; 
	
	@Transactional
	public boolean addContact(Long userId, Long contactId) {
		User user = userService.getUserById(userId);
		User contact = userService.getUserById(contactId);
		user.getContacts().add(contact);
		userService.persistObject(user);
		return true;
	}

	@Transactional
	public boolean deleteContact(Long userId, Long contactId) {
		User user = userService.getUserById(userId);
		User contact = userService.getUserById(contactId);
		user.getContacts().remove(contact);
		userService.persistObject(user);
		return true;
	}

	public List<Long> getContactList(Long userid) {

		return null;
	}

}
