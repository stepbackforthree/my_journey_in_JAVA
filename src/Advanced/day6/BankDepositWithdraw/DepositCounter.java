package Advanced.day6.BankDepositWithdraw;

public class DepositCounter implements Runnable {
    private Account account;

    public DepositCounter(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            deposit(1000);
        }
    }

    private void deposit(int money) {
        account.depositMoney(money);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
