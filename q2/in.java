class MessWallet {
    private double balance;

    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance is not allowed. Starting at 0.");
            balance = 0;
        } else {
            balance = openingBalance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be greater than 0.");
            return;
        }
        balance += amount;
        System.out.printf("Top-up successful. Balance: %.2f%n", balance);
    }

    public void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Deduction rejected: amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Deduction rejected: insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("Deduction successful. Balance: %.2f%n", balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class in {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(-100);
        wallet.topUp(500);
        wallet.deduct(125);
        wallet.deduct(500);
        wallet.topUp(0);
        System.out.printf("Final balance: %.2f%n", wallet.getBalance());
    }
}