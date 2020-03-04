package org.ntshinga;

public class encapsulation {
    private String emailAddress;
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String email){
        if(email.indexOf("@") !=-1){
            this.emailAddress = email;
        }else{
            throw new IllegalArgumentException("Not a Valid Email Address entered.");
        }
    }
}