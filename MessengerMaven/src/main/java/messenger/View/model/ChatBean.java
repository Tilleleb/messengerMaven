package messenger.View.model;

import java.util.List;

import javax.annotation.PostConstruct;

import messenger.Interface.ManageChatGroups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class ChatBean {
    
	/*
	@Autowired
    private FehlerService fehlerService;*/
	
    @Autowired
    private ManageChatGroups manageChatGroups;
    
    @Autowired
    private UserBean userBean;
    
    private List<String> chatList;
    
   //private Projekt projekt = new Projekt();
    
/*
    private Chat chat = new Chat();
    
    private List<Projekt> projektList;
    */
    
    @PostConstruct
    private void init() {

        //projektList = fehlerService.selectProjekteFromDb();
        
    }
    
	/*
    private void init() {
        projektList = fehlerService.selectProjekteFromDb();
        
    }
    
    public List<Projekt> getProjektList() {
        return projektList;
    }
    
    public String showProjekt(Projekt projekt) {
        this.setProjekt(projekt);
        return "success";
    }
    
    public Projekt getProjekt() {
        return projekt;
    }
    
    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }
    
    public UserBean getUserBean() {
        return userBean;
    }
    
    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
    */

}
