class ATMmachine {

    private int balance;

    ATMmachine(int balance) {
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

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class abstraction {

    public static void main(String[] args) {

        ATMmachine a = new ATMmachine(5000);

        a.showBalance();
        a.withdraw(1000);
        a.showBalance();
    }
}