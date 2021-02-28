package checkaccount;

class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account() {
    }

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

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Your current balance is: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your current balance is: " + balance);
        System.out.println("Monthly rate is: " + getMonthlyInterest());
    }
}

class CheckAccount extends Account {
    double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void printInfo() {
        System.out.println("Your current balance is: " + getBalance());
        System.out.println("Your current overdraft is: " + overdraft);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            if (overdraft > amount - getBalance()) {
                overdraft -= amount - getBalance();
                setBalance(0.0);
                balance = 0.0;
            } else {
                System.out.println("Beyond overdraft! Withdraw failed.");
            }
        }
        printInfo();
    }
}

public class CheckAccountTest {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000, 0.045);
        a.withdraw(30000);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("-----------------------------");
        CheckAccount b = new CheckAccount(1122, 20000, 0.045, 5000);
        double[] withdrawCollection = {5000, 18000, 3000};
        for (double amount : withdrawCollection) {
            b.withdraw(amount);
        }
    }
}
