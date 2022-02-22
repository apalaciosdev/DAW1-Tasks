public class User {    
    protected String name;    
    protected String password;
    
    public User(String name, String password) {
    	this.name = name;    	
    	this.password = password;
    }
    
    public void ChangePassword(String password) {
    	this.password = password;
    }
}