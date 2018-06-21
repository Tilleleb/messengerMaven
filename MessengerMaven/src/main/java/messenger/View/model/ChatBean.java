package messenger.View.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import messenger.Interface.Communication;

import org.springframework.beans.factory.annotation.Autowired;


@ManagedBean
@SessionScoped
public class ChatBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{userBean}")
    private UserBean userBean;
    
	@ManagedProperty("#{chatBeanList}")
    private ChatListBean chatBeanList;
    
	@ManagedProperty("#{communication}")
    private Communication communication;
    
    private String[][] arrayMessages;
    
    private String message;
    
    private List<String> messageList = new ArrayList<String>();
    
    
    @PostConstruct
    private void init() {
    	//communication.recieveMessage(chatBeanList.getChatId());
    }

	public UserBean getUserBean() {
		return userBean;
	}


	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}


	public ChatListBean getChatBeanList() {
		return chatBeanList;
	}


	public void setChatBeanList(ChatListBean chatBeanList) {
		this.chatBeanList = chatBeanList;
	}


	public Communication getCommunication() {
		return communication;
	}


	public void setCommunication(Communication communication) {
		this.communication = communication;
	}


	public String[][] getArrayMessages() {
		return arrayMessages;
	}


	public void setArrayMessages(String[][] arrayMessages) {
		this.arrayMessages = arrayMessages;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public List<String> getMessageList() {
		return messageList;
	}


	public void setMessageList(List<String> messageList) {
		this.messageList = messageList;
	}
    
	public void sendMessage(){
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date date = new Date();
		
		messageList.add(userBean.getUsername() + " - " + dateFormat.format(date) + " - " + message);
		this.message = "";
	}

}
