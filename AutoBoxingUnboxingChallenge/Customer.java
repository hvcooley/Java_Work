package dev.cooley;

import java.util.ArrayList;

public class Customer {
    private String name;

    private String myBankName;

    private ArrayList<Double> transactions;

    //Constructors
    public Customer(){
        this("No-name");
    }
    public Customer(String name){
        this(name, "", new ArrayList<>());
    }

    public Customer(String name, String myBankName, ArrayList<Double> transactions) {
        this.name = name;
        this.myBankName = myBankName;
        this.transactions = transactions;
    }

    //Getters
    public String getName(){
        return name;
    }

    //Other Functions
    public void makeTransaction(double amt){
        transactions.add(amt);
    }
    public void joinBank(String bankName){
        myBankName = bankName;
    }

    public void printTransactions(){
        System.out.println(transactions);
    }
}
