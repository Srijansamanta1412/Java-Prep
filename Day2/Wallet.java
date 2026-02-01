package Day2;

public class Wallet {
    public static double balance = 500;
    public Wallet() {
    }

    public synchronized void withdraw(double amount) {
        try{
        System.out.println("Current Balance: " + balance);
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw: " + amount + "with balance: " + balance); 
        Thread.sleep(100); // Simulate some processing time 
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
