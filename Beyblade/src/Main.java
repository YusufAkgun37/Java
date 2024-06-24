
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to Beyblade Program...");
        System.out.println("Press 'q' for exit...");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Which beyblade do you want to produce ? ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("q")) {
                System.out.println("Exiting the Program...");
                break;
                
            }
            else{
                BeybladeFactory factory = new BeybladeFactory();
                Beyblade beyblade = factory.produceBeyblade(transaction);
                
                if (beyblade == null) {
                    System.out.println("Please enter a valid name...");    
                }
                else{
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.specialMonsterAppears();
                }
            }
        }
    }
    
}
