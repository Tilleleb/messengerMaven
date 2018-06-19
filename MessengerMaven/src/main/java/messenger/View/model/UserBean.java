package messenger.View.model;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import messenger.Domain.User;
import messenger.Interface.GetUser;
import messenger.Interface.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@ManagedBean(name = "userBean")
@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserBean implements Serializable {
    
    @Autowired
    private UserManagement userManagement;
    
    @Autowired
    private GetUser getUser;
    
    private List<SimpleEntry<Long, String>> userList = new ArrayList<SimpleEntry<Long, String>>();
    
    private String username;
    
    private Long userId;
    
    private boolean isUserSet =false;
    
    @PostConstruct
    public void init() {
    
        //userList = userManagement.getAllUsers();
    }

	public UserManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}

	/*
	public List<Object> getUserList() {
		return userList;
	}

	public void setUserList(List<Object> userList) {
		this.userList = userList;
	}*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean getIsUserSet() {
		return isUserSet;
	}

	public void setIsUserSet(boolean isUserSet) {
		this.isUserSet = isUserSet;
	}
    
    public String save(){
    	userId = (long) 2;
    	//userId = (long) getUser.getUser(username);
    	isUserSet = true;
    	return "success";
    }
    
    public String logout(){
    	isUserSet = false;
    	username = "";
    	userId = null;
    	return "chooseUser?faces-redirect=true";
    }
    
    
}
