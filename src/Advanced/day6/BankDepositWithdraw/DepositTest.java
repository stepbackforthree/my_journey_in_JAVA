package Advanced.day6.BankDepositWithdraw;

public class DepositTest {
    public static void main(String[] args) {
        Account account = new Account("a", 0);
        DepositCounter depositCounter = new DepositCounter(account);
        new Thread(depositCounter).start();
        new Thread(depositCounter).start();
    }
}
