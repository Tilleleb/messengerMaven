package messenger.View.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import messenger.Domain.User;
import messenger.Interface.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserBean implements Serializable {
    
    @Autowired
    private UserManagement userManagement;
    
    private List<User> userList = new ArrayList<User>();
    
    private User user = new User();
    
    private boolean isUserSet =false;
    /*
    @PostConstruct
    public void init() {
        userList = userService.selectUsers();
    }
    
  /*  public String save(){
    	isUserSet = true;
    	return "success";
    }
    
    public String logout(){
    	isUserSet = false;
    	user = new User();
    	return "chooseUser?faces-redirect=true";
    }
    
    public List<User> getUserList() {
        return userList;
    }
    
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

	public boolean getIsUserSet() {
		return isUserSet;
	}*/
}
