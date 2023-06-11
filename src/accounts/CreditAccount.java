package accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, long balance) {
        super(name, balance);
        this.balance = 0;
    }

    private static int checkBalance(int balance) {
        if (balance < 0) return balance;
        else return -balance;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount <= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            balance -= amount;
            return false;
        } else {
            return true;
        }
    }
}


