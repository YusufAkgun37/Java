
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Employees Program...");
        
        String transactions = 
                "transactions...\n"
                +"1. Programmer operations\n"
                +"2. Manager operations\n"
                +"Press 'q' for quit";
        System.out.println("******************************");
        System.out.println(transactions);
        System.out.println("******************************");
        
        while (true) {            
            System.out.print("Choose the transaction: ");
            String transaction = scanner.nextLine();
            
            
            if (transaction.equals("q")) {
                System.out.println("Exiting the program...");
                break;
            }
            
            
            else if (transaction.equals("1")) {
                Programmer programmer = new Programmer("Java,C,Phyton", "Lionel", "Messi", 10);
                String programmer_transaction = 
                        "Programmer transactions...\n"
                        +"1. Formatting\n"
                        +"2. Show information\n"
                        +"Press q for quit";
                System.out.println(programmer_transaction);
                while (true) {    
                    System.out.print("Choose the transaction: ");
                    String p_transaction = scanner.nextLine();
                    
                    if (p_transaction.equals("q")) {
                        System.out.println("Exiting programmer transactions...");
                        break;
                    }
                    else if (p_transaction.equals("1")) {
                        System.out.print("Operating System: ");
                        String operating_system = scanner.nextLine();
                        programmer.formatting(operating_system);   
                    }
                    
                    else if (p_transaction.equals("2")) {
                        programmer.showInformation();
                    }
                    else{
                        System.out.println("Invalid programmer transation");    
                    }
                }
            }
            
            
            else if (transaction.equals("2")) {
                Manager manager = new Manager("Pep", "Guardiola", 28, 11);
                String manager_transaction = 
                        "Manager transactions...\n"
                        +"1. Give a raise\n"
                        +"2. Show inforamtion\n"
                        +"Press q for quit";
                System.out.println(manager_transaction);
                
                while (true) {                    
                    System.out.print("Choose a transaction: ");
                    String m_transaction = scanner.nextLine();
                    
                    if (m_transaction.equals("q")) {
                        System.out.println("Exiting manager transactions...");
                        break;
                    }
                    else if (m_transaction.equals("1")) {
                        System.out.print("How much raise do you want the manager to give?: ");
                        int raise_amount = scanner.nextInt();
                        scanner.nextLine();
                        manager.give_a_raise(raise_amount);
                    }
                    else if (m_transaction.equals("2")) {
                        manager.showInformation();
                    }
                    else{
                        System.out.println("Invalid manager transaction");
                    }
                }
            }
            
            
            else{
                System.out.println("Invalid transaction");
            }
            
            
        }
    }
    
}
