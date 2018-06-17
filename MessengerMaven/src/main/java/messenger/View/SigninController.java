package messenger.View;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import messenger.View.model.User;

@Named
@SessionScoped
public class SigninController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private User user;
	
	private String signedIn;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getSignedIn() {
		return signedIn;
	}

	public void setSignedIn(String signedIn) {
		this.signedIn = signedIn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String signout() {
		FacesContext
		.getCurrentInstance()
		.getExternalContext()
		.invalidateSession();
		
		return "/index.jsf?faces-redirect=true";
	}
	
	public String find() {
		if(
				user != null &&
				user.getUsername() != null &&
				user.getPassword() != null &&
				user.getUsername().equals("admin") &&
				user.getPassword().equals("admin")){
			
			/*FacesMessage m = 
					new FacesMessage(
							FacesMessage.SEVERITY_INFO,
							"Erfolgreich angemeldet!",
							"Sie haben sich erfolgreich angemeldet!");
			FacesContext
			.getCurrentInstance()
			.addMessage(null, m);*/
			
			signedIn = "Angemeldet!";
			
			return "/chat.jsf?faces-redirect=true"; 
		} else {
			signedIn = "Nicht angemeldet!";
			return "/index.jsf?faces-redirect=true";
		}
		
	}
	
}
