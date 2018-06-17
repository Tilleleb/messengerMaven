package messenger.View.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.Dependent;

@Dependent
public class Message implements Serializable{

	private static final long serialVersionUID = 1L;

	private String text;
	
	private String timestamp;
	
	


	public Message(String text) {
		super();
		this.text = text;
		timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}


