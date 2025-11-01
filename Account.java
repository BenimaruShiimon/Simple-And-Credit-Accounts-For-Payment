package OOP.AbstractionsAndInterface.Exampe;

public abstract class Account {
  public abstract boolean add(long amount);

  public abstract boolean pay(long amount);

  public abstract boolean transfer(Account account, long amount);

  public abstract long getBalance();
}
