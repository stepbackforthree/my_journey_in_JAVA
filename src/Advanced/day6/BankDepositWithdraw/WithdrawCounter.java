package Advanced.day6.BankDepositWithdraw;

public class WithdrawCounter implements Runnable {
    private Account account;

    public WithdrawCounter(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            withdraw(1000);
        }
    }

    private void withdraw(int money) {
        account.withdrawMoney(money);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
