package messenger.View.model;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

@Dependent
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String username;
	private String password;
	
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
	
	
}
