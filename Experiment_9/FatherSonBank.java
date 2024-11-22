import java.util.Random;

// Class to represent the shared bank account
class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method to add money to the account
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Father deposited Rs. " + amount + ". Current balance: Rs. " + balance);
        notifyAll();  // Notify all threads that the balance has changed
    }

    // Withdraw method to withdraw money from the account
    public synchronized void withdraw(int amount) {
        // Wait until the balance exceeds Rs. 2000 for the son to withdraw
        while (balance <= 2000) {
            try {
                wait();  // Son will wait until balance exceeds Rs. 2000
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // If the balance is above Rs. 500, the son can withdraw
        if (balance > 500) {
            balance -= amount;
            System.out.println("Son withdrew Rs. " + amount + ". Current balance: Rs. " + balance);
        }

        // If balance goes below Rs. 500, the son stops withdrawing
        if (balance < 500) {
            System.out.println("Balance is below Rs. 500, son stops withdrawing.");
            notifyAll();  // Notify father to deposit more
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Father thread class to deposit money
class FatherThread extends Thread {
    private BankAccount account;
    private Random random;

    public FatherThread(BankAccount account) {
        this.account = account;
        this.random = new Random();
    }

    @Override
    public void run() {
        // Father deposits money until balance crosses Rs. 2000
        while (account.getBalance() <= 2000) {
            int depositAmount = random.nextInt(200) + 1;  // Random amount between Rs. 1 and Rs. 200
            account.deposit(depositAmount);
            try {
                Thread.sleep(500);  // Simulate time delay between deposits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Son thread class to withdraw money
class SonThread extends Thread {
    private BankAccount account;
    private Random random;

    public SonThread(BankAccount account) {
        this.account = account;
        this.random = new Random();
    }

    @Override
    public void run() {
        // Son withdraws money once balance exceeds Rs. 2000 and continues till balance is above Rs. 500
        while (account.getBalance() > 0) {
            if (account.getBalance() > 2000) {
                int withdrawAmount = random.nextInt(150) + 1;  // Random amount between Rs. 1 and Rs. 150
                account.withdraw(withdrawAmount);
            }

            try {
                Thread.sleep(1000);  // Simulate time delay between withdrawals
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class FatherSonBank {
    public static void main(String[] args) {
        // Create the bank account with an initial deposit of Rs. 600
        BankAccount account = new BankAccount(600);

        // Create and start the Father and Son threads
        FatherThread father = new FatherThread(account);
        SonThread son = new SonThread(account);

        father.start();
        son.start();

        try {
            // Wait for both threads to finish
            father.join();
            son.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
