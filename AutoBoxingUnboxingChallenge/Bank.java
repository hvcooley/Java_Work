package dev.cooley;

import java.util.ArrayList;

public class Bank {
    private String bankName;

    private ArrayList<Customer> customers;

    public Bank(){
        this("Generic_Bank");
    }

    public Bank(String bankName){
        this(bankName, new ArrayList<Customer>());

    }
    public Bank(String bankName, ArrayList<Customer> customers){
        this.bankName = bankName;
        this.customers = customers;
    }

    //Could have simplified this code by adding a get customer function which would search the list and return the
    // desired customer. I end up re-writing the for loop statement to find a customer a couple times
    public void addCustomer(Customer newCustomer){
        boolean flag = false;

        for (Customer cust: customers){
            if (cust.getName() == newCustomer.getName()){
                flag = true;
                break;
            }
        }

        if (flag == false){
            customers.add(newCustomer);
            newCustomer.joinBank(bankName);
        }
    }

    public void addTransaction(String custName, double amt){
        //could make this more efficient by implementing the customer list as a HashMap,
        // but for the exercise will just use the ArrayList to focus on the autoboxing feature

        for (Customer cust: customers){
            if (cust.getName() == custName){
                cust.makeTransaction(amt);
            }
        }
    }

    public void printAllCustomers(){
        for (Customer cust: customers){
            System.out.println(cust.getName());
        }
    }

    public void printCustTransactions(String name){
        for (Customer cust: customers){
            if (cust.getName() == name){
                System.out.print(cust.getName() + " has the following transactions: " );
                cust.printTransactions();
            }
        }
    }

}//END class Bank
