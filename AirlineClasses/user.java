package AirlineClasses;

public class user {
      private String Username;
    private int password;
    private String FirstName;
    private String LastName;
    private String Address;
    private String PhoneNum;

    public user(String Username, int password, String FirstName, String LastName, String Address, String PhoneNum) {
        this.Username = Username;
        this.password = password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.PhoneNum = PhoneNum;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }
  
     
}
