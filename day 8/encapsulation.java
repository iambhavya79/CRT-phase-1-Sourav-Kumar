class ATM {

    private int balance;

    void setBalance(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    int getBalance() {
        return balance;
    }
}

public class encapsulation {

    public static void main(String[] args) {

        ATM a = new ATM();

        a.setBalance(5000);

        System.out.println("Balance is: " + a.getBalance());

        a.withdraw(500);

        System.out.println("Balance is: " + a.getBalance());
    }
}