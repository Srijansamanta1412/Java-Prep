public class Main {
    int x = 5;
  
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
      Users u = new Users();
      u.wallet.addFunds(100.0);
      System.out.println("User wallet balance: " + u.wallet.getBalance());

    }
  }