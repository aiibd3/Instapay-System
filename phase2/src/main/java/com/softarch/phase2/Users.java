package com.softarch.phase2;

public class Users {
    // this part initiates user account and wallet
    public String Username;
    public String Email;
    public String Password;
    public String mobileNumber;

    public BankAccount account = new BankAccount();
    Logs l = new Logs();
    String CardNumber;

    public Users() // this part is the constructor giving initial value to its attributes
    {
        Username = "ljkshadflkjhasfdglkjhasdfg";
        Email = "ljkshadflkjhasfdglkjhasdfg";
        Password = "ljkshadflkjhasfdglkjhasdfg";
        mobileNumber = "ljkshadflkjhasfdglkjhasdfg";
    }

    public Users(String username, String email, String password, String mobileNumber) {
        Username = username;
        Email = email;
        Password = password;
        this.mobileNumber = mobileNumber;
    }


    public String setUser(Users k) {
        // setter for user attributes
        Username = k.Username;
        Email = k.Email;
        Password = k.Password;
        mobileNumber = k.mobileNumber;
        return "Added Successfully";
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    } // setter for cardNumber
}
