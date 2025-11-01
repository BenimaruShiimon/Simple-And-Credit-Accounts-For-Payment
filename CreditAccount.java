package OOP.AbstractionsAndInterface.Exampe;

public class CreditAccount extends Account {
    private static final int INITIAL_BALANCE = 10_000;
    private int creditBalance;
    private int creditMonitor = 0;

    public CreditAccount(int creditBalance, int creditMonitor) {
        this.creditBalance = INITIAL_BALANCE;
        this.creditMonitor = INITIAL_BALANCE - 10;
    }

    @Override
    public boolean add(long amount) {
        if (creditBalance + amount > INITIAL_BALANCE) {
            System.out.println("Вы превысили допустимый лимит пополнения! Пополнить счет можно только до " + INITIAL_BALANCE);
            return false;
        }
        creditBalance += (int) amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (creditBalance - amount < -creditMonitor) {
            System.out.println("Вы вышли за предел допустимого значения по кредиту! Пополните баланс до значения " + INITIAL_BALANCE);
            return false;
        }
        creditBalance -= (int) amount;
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            return account.pay(amount);
        }
        return false;
    }

    @Override
    public long getBalance() {
        return creditBalance;
    }
}


