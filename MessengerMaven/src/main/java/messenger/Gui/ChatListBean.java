package messenger.Gui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import messenger.ChatService.ManageChatGroups;



@Component
@Scope("prototype")
public class ChatListBean implements Serializable{

	@Autowired
    private ManageChatGroups manageChatGroups;
    
	@Autowired
    private UserBean userBean;
    
    private String[][] arrayChats;
    
    private String chat;
    
    private String chatId;
    
    private List<Long> chatList = new ArrayList<Long>();
    
    
    @PostConstruct
    private void init() {
        chatList.add(3L);
        chatList.add(4L);
    	//chatList = manageChatGroups.getAllConversations(6L);
    }


	public ManageChatGroups getManageChatGroups() {
		return manageChatGroups;
	}


	public void setManageChatGroups(ManageChatGroups manageChatGroups) {
		this.manageChatGroups = manageChatGroups;
	}


	public UserBean getUserBean() {
		return userBean;
	}


	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}


	public String[][] getArrayChats() {
		return arrayChats;
	}


	public void setArrayChats(String[][] arrayChats) {
		this.arrayChats = arrayChats;
	}


	public List<Long> getChatList() {
		return chatList;
	}


	public void setChatList(List<Long> chatList) {
		this.chatList = chatList;
	}
    
    public String showChat() {
        return "success";
    }


	public String getChat() {
		return chat;
	}


	public void setChat(String chat) {
		this.chat = chat;
	}


	public String getChatId() {
		return chatId;
	}


	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
    

}
