package messenger.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
public class User {

    @GeneratedValue
    @Id
    @Column(name = "USER_ID")
    private int userId;
    
    @Column(name = "USERNAME")
    private String username;
    
    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany
    @JoinTable(name = "CONTACTS",
    	joinColumns = @JoinColumn(name = "USER_ID"),
    	inverseJoinColumns = @JoinColumn(name = "CONTACT_ID")
    )
    private List<User> contacts = new ArrayList<User>();
    
    @ManyToMany
    @JoinTable(name = "CONTACTS",
    	joinColumns = @JoinColumn(name = "CONTACT_ID"),
    	inverseJoinColumns = @JoinColumn(name = "USER_ID")
    )
    private List<User> contactOf = new ArrayList<User>();
	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
