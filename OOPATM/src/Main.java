

public class Main {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        
        Account account = new Account("admin","12345", 10000);
        
        atm.work(account);
        System.out.println("Exiting...");
        
        
        
        
    }
 
}

