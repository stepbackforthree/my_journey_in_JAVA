package Advanced.day6.BankDepositWithdraw;

public class Account {
    private String name;
    private Integer balance;

    public Account(String name, Integer balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public  void setBalance(Integer balance) {
        this.balance = balance;
    }

    public synchronized void depositMoney(int money) {
        balance += money;
        System.out.println("账户" + name + "当前余额：" + balance);
    }

    public synchronized void withdrawMoney(int money) {
        balance -= money;
        System.out.println("账户" + name + "当前余额：" + balance);
    }

    @Override
    public String toString() {
        return "账户" + name + "余额：" + balance;
    }
}
