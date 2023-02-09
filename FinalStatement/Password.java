package com.cooley;

public class Password {
    private static final int key = 349568;
    private final int encryptedPassword;

    public Password(int password){
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    //Now with final keyword, this function's behavior cannot be changed in a subclass
    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean logIn(int password){
        if (encryptDecrypt(password) == encryptedPassword){
            System.out.println("Logged in!");
            return true;
        }
        else{
            System.out.println("Incorrect password");
            return false;
        }
    }

}
