package OOP.AbstractionsAndInterface.Exampe;

public class SimpleAccount extends Account {
    private long balance;

    public SimpleAccount(long balance) {
        this.balance = balance;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            account.add(amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public long getBalance() {
        return balance;
    }
}
