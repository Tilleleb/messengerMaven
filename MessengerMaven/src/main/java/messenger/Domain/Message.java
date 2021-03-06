package messenger.Domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "MESSAGE_ID")
	private Long messageId;

	@Column(name = "TEXT")
	private String text;
	
	@Column(name = "TIMESTAMP")
	private Timestamp timestamp;
	
    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User sender;
    
    public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public ChatConversation getChat() {
		return chat;
	}

	public void setChat(ChatConversation chat) {
		this.chat = chat;
	}

	@ManyToOne
    @JoinColumn(name="CHAT_ID")
    private ChatConversation chat;	
}
