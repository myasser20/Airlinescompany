/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineClasses;

import java.util.Scanner;
public class Signups extends Signin{
private String FirstName ;
     private String lastName ;
     private String Address;
     private String phonenum;
     private String Password="123";
     private String ConfirmPassword="123";
     private String NewPassword;

     Signin s=new Signin() {
    @Override
    public void forgetpass(String user) {
        NewPassword=Password;
    }
};
    public Signups(String FirstName, String lastName, String Email, String Password, String ConfirmPassword) { //, String ConfirmPassword// if you gonna add thr Confirmation
        super(Email, Password);
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.ConfirmPassword = ConfirmPassword;
    }

    public Signups() {
   System.out.println("Please fill in your informations");
    }
     
    public boolean Check (String password,String confirmPassword){
         if(password.equals(confirmPassword)){
             return true;
         }
         else
             System.out.println(false);
        return false;
     }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

   
    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    @Override
    public void forgetpass(String userl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
