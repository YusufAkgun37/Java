
import java.util.Scanner;


public class Login {
    
    public  boolean login(Account account){
        
        Scanner scanner = new Scanner(System.in);
        String ID;
        String password;
        
        System.out.print("ID : ");
        ID = scanner.nextLine();
        System.out.print("Password : ");
        password = scanner.nextLine();
        
        if (account.getID().equals(ID) && account.getPassword().equals(password)){
            return true;   
        }
        
        else {
            return false;
        }
        
        
    }
}
