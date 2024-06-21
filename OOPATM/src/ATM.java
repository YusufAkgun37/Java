import java.util.Scanner;


public class ATM {
    
    public void work(Account account) {
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome....");
        
        System.out.println("****************************");
        System.out.println("User Login");
        System.out.println("****************************");
        int right_of_entry = 3;
        
        while (true) {
            if (login.login(account)) {
                System.out.println("Login successful...");
                break;
                
                
            }
            else {
                System.out.println("Login Failed...");
                right_of_entry -= 1;
                System.out.println("Remaining Entry Rights : " + right_of_entry);
            }
            if (right_of_entry == 0 ){
                System.out.println("Your Login Rights Have Expired...");
                
                return;
                
            }
             
            
            
        }
        
        System.out.println("*********************************");
        String transactions = "1. View Balance\n"
                          + "2. Deposit\n"
                          + "3. Withdraw money\n"
                          + "Press q to exit";
        System.out.println(transactions);
        System.out.println("**********************************");
        
        
        while (true) {
            System.out.println("Select Transaction : ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("q")){
                
                break;
                
            }
            else if (transaction.equals("1")){
                System.out.println("Your Amount : " + account.getBalance());
            }
            else if (transaction.equals("2")){
                
                System.out.print("The amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);
                
            }
            else if (transaction.equals("3")) {
                
                System.out.print("The amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdrawMoney(amount);
                
            }
            else {
                
                System.out.println("invalid transaction ....");
            }
            
            
            
        }
    }
    
}

