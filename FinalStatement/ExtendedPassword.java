package com.cooley;


//Example of how to get around the password protection from the original password class
//This class demonstrates how using the final keyword in the original Password class is valuable
public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }

    //By overriding the original password function, now one can get the decrypted password
    //Fix is to make parent function final
//    @Override
//    public void storePassword(){
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
