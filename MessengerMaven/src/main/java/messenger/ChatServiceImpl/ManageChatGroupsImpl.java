package messenger.ChatServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import messenger.ChatService.ManageChatGroups;
import messenger.DbService.ConversationService;
import messenger.DbService.UserService;
import messenger.Domain.ChatConversation;
import messenger.Domain.GroupConversation;
import messenger.Domain.User;
import messenger.Domain.UserChat;

@Service
@Scope("singleton")
public class ManageChatGroupsImpl implements ManageChatGroups {

	@Autowired
	private ConversationService conversationService;

	@Autowired
	private UserService userService;

	@Transactional
	public boolean addConversation(Long userId) {
		User user = userService.getUserById(userId);
		if (user == null)
			return false;
		ChatConversation newChatConversation = new ChatConversation();
		UserChat newUserChat = new UserChat();
		newUserChat.setChat(newChatConversation);
		newUserChat.setUser(user);
		newUserChat.setAdmin(true);
		conversationService.persistObject(newChatConversation);
		conversationService.persistObject(newUserChat);
		return true;
	}

	@Transactional
	public boolean addGroupConversation(Long userId, String name, byte[] picture) {
		if (name == null) name = "NoName";
		User user = userService.getUserById(userId);
		if (user == null)
			return false;
		ChatConversation newChatConversation = new ChatConversation();
		UserChat newUserChat = new UserChat();
		newUserChat.setChat(newChatConversation);
		newUserChat.setUser(user);
		newUserChat.setAdmin(true);
		GroupConversation newGroupConversation = new GroupConversation();
		newGroupConversation.setChatId(newChatConversation.getChatId());
		newGroupConversation.setName(name);
		conversationService.persistObject(newChatConversation);
		conversationService.persistObject(newUserChat);
		conversationService.persistObject(newGroupConversation);
		return true;
	}

	@Transactional
	public boolean deleteConveration(Long chatId) {
		ChatConversation chatConversation = conversationService.getChatById(chatId);
		List<UserChat> userChatList = conversationService.getUserChatsById(chatId);
		GroupConversation groupConversation = conversationService.getGroupChatById(chatId);
		if (chatConversation == null) return false;
		if (groupConversation != null) conversationService.removeObject(groupConversation);
		for (UserChat userChat : userChatList) conversationService.removeObject(userChat);
		conversationService.removeObject(chatConversation);
		return true;
	}

	@Transactional
	public boolean updateConversation(Long chatId, String name, byte[] picture) {
		GroupConversation groupConversation = conversationService.getGroupChatById(chatId);
		groupConversation.setName(name);
		conversationService.mergeObject(groupConversation);
		return true;
	}

	public List<Long> getAllConversations(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean addUserToConversation(Long chatId, Long userId) {
		ChatConversation chatConversation = conversationService.getChatById(chatId);
		if (chatConversation == null) return false;
		User user = userService.getUserById(userId);
		if (user == null) return false;
		UserChat newUserChat = new UserChat();
		newUserChat.setChat(chatConversation);
		newUserChat.setUser(user);
		conversationService.persistObject(newUserChat);
		return true;
	}

	@Transactional
	public boolean deleteUserFromConversation(Long chatId, Long userId) {
		// TODO: Gucken obs der letzt user ist und dann den chat mitlöschen oder exception
		UserChat userChat = conversationService.getUserChatById(chatId, userId);
		if (userChat == null) return false;
		conversationService.removeObject(userChat);
		return true;
	}

	@Transactional
	public boolean grantAdminPermission(Long chatId, Long userId) {
		UserChat userChat = conversationService.getUserChatById(chatId, userId);
		if (userChat == null) return false;
		userChat.setAdmin(true);
		conversationService.mergeObject(userChat);
		return true;
	}

	@Transactional
	public boolean revokeAdminPermission(Long chatId, Long userId) {
		// TODO: Gucken obs der letzte Admin war... Der letzte Admin darf nicht gelöscht werden
		UserChat userChat = conversationService.getUserChatById(chatId, userId);
		if (userChat == null) return false;
		userChat.setAdmin(false);
		conversationService.mergeObject(userChat);
		return true;
	}

}
