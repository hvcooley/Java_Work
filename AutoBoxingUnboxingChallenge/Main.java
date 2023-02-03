package dev.cooley;

public class Main {

    public static void main(String[] args) {
        Bank cooleyBank = new Bank();

        String[] customers = {"Harrison", "Leo", "Isabella"};

        for (String name: customers){
            Customer newCustomer = new Customer(name);
            cooleyBank.addCustomer(newCustomer);
        }

        cooleyBank.printAllCustomers();

        //Make $50.00 positive transactions in each persons account
        for (String name: customers){
            cooleyBank.addTransaction(name ,50.00);
        }

        double[] newTransactions = {45.00, 35.00, 65.00, -20.00};

        for (double trans: newTransactions){
            cooleyBank.addTransaction("Harrison", trans);
        }

        cooleyBank.printCustTransactions("Harrison");

    }
}
