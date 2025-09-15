
import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccount(){
        System.out.println("Account Number: "+accountNumber+", Balance: "+balance);
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public void viewAccounts(){
        System.out.println("Customer: "+name);
        for(Account a : accounts){
            a.displayAccount();
        }
        System.out.println();
    }
}

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName){
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void openAccount(Customer customer, Account account){
        customer.addAccount(account);
    }

    public void displayDetails(){
        System.out.println("Bank: " + bankName);
        for(Customer c : customers){
            c.viewAccounts();
        }
    }

    public static void main(String[] args){
        Bank bank = new Bank("My Bank");

        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        bank.addCustomer(cust1);
        bank.addCustomer(cust2);

        Account acc1 = new Account("ACC001", 1000);
        Account acc2 = new Account("ACC002", 2000);
        Account acc3 = new Account("ACC003", 5000);

        bank.openAccount(cust1, acc1);
        bank.openAccount(cust1, acc2);
        bank.openAccount(cust2, acc3);

        bank.displayDetails();
    }
}
