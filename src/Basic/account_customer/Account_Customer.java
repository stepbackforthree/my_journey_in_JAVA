package account_customer;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient balance, withdrawal failed.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successfully: " + amount);
        }
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited successfully: " + amount);
    }

}

class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

public class Account_Customer {
    public static void main(String[] args) {
        Customer customer_1 = new Customer("Jane", "Smith");
        Account JaneSmith = new Account(1000, 2000, 0.0123);
        customer_1.setAccount(JaneSmith);
        customer_1.getAccount().deposit(100);
        customer_1.getAccount().withdraw(960);
        customer_1.getAccount().withdraw(2000);
        System.out.println("Customer [" + customer_1.getFirstName() +
                " " + customer_1.getLastName() + "] " + "has a account: id is " +
                customer_1.getAccount().getId() + ", annualInterestRate is " +
                customer_1.getAccount().getAnnualInterestRate() * 100 +
                "%, balance is " + customer_1.getAccount().getBalance());
    }
}
