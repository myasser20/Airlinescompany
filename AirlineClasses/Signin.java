
package AirlineClasses;

public abstract class Signin {
    private  String user ; 
    private String Password ;
    public abstract void forgetpass(String user); 
    public String getuser() {
        return user;

    }

    public void setuser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Signin() {
    }

    public Signin(String user, String Password) {
        this.user = user;
        this.Password = Password;
    }
    
}
