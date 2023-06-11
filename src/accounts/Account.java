package accounts;

public abstract class Account {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(long amount) {
        balance += amount;
        return false;
    }

    public boolean add(long amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}

