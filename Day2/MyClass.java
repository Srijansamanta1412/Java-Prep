package Day2;
public class MyClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
        Wallet wallet = new Wallet();
        wallet.withdraw(300);
    }


    public static void main(String[] args) {

        MyClass myThread1 = new MyClass();
        MyClass myThread2 = new MyClass();
        myThread1.start();
        myThread2.start();
        
        System.out.println("Hello, World!");
    }   
}
