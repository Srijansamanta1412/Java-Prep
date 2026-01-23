public class Wallet {
    Double balance;

    public Wallet(Double initialBalance) {
        this.balance = initialBalance;
    }

    public void addFunds(Double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean deductFunds(Double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public Double getBalance() {
        return balance;
    }
}
