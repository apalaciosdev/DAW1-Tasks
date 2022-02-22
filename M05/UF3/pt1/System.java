import java.util.ArrayList;
import java.util.List;

public class System {
    private List<User> users = new ArrayList<User>();
    
    public User createUser(String username, String password) {
    	User u = new User(username, password);
    	this.users.add(u);
    	
    	return u;
    }
    
    public Admin convertToAdmin(User u) {
    	return null;
    }    
}