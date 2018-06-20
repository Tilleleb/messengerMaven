package messenger.View.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import messenger.Interface.GetUser;
import messenger.Interface.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Autowired
    private UserManagement userManagement;
    
    @Autowired
    private GetUser getUser;
    
    private List<String> userList = new ArrayList<String>();
    
    private String username;
    
    private Long userId;
    
    private boolean isUserSet =false;
    
    @PostConstruct
    public void init() {
    	userList.add("Peter");
    	userList.add("Bob");
    	//userList = userManagement.getAllUsers();
    }

	public UserManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}

	
	public List<String> getUserList() {
		return userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

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
