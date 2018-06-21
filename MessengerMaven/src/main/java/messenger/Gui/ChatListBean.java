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

import messenger.ChatService.ManageChatGroups;



@ManagedBean
@SessionScoped
public class ChatListBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired
    private ManageChatGroups manageChatGroups;
    
    @ManagedProperty("#{userBean}")
    private UserBean userBean;
    
    private String[][] arrayChats;
    
    private String chat;
    
    private String chatId;
    
    private List<String> chatList = new ArrayList<String>();
    
    
    @PostConstruct
    private void init() {
    	chatList.add("ChatA");
    	chatList.add("ChatB");
        
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


	public List<String> getChatList() {
		return chatList;
	}


	public void setChatList(List<String> chatList) {
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
