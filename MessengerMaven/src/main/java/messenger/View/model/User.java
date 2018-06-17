package messenger.View.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

@Dependent
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String username;
	private String password;
	private List<Message> chat = new ArrayList<Message>();
	
	@PostConstruct
    public void init() {
		chat.add(new Message("Text1"));
		chat.add(new Message("Text2"));
		chat.add(new Message("Text3"));
		chat.add(new Message("Text4"));
    }
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String email) {
		this.username = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addMessage(String text){
		Message message = new Message(text);
		chat.add(message);
	}
	public List<Message> getChat() {
		return chat;
	}
	public void setChat(List<Message> chat) {
		this.chat = chat;
	}
	
}
