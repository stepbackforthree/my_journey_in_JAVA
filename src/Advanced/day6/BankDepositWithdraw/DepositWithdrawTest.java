package Advanced.day6.BankDepositWithdraw;

public class DepositWithdrawTest {
    public static void main(String[] args) {
        Account account = new Account("b", 3000);
        new Thread(new DepositCounter(account)).start();
        new Thread(new WithdrawCounter(account)).start();
    }
}
