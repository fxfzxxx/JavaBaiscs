package Exception_Test;

public class CheckAccount {
    private double balance;
    private int accNumber;

    public CheckAccount(int num) {
        this.accNumber = num;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance > amount) {
            balance -= amount;
        } else {
            double overDraft = amount - balance;
            throw new InsufficientFundsException(overDraft);
        }

    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }
}
