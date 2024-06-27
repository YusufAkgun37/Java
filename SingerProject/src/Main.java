
import java.util.Scanner;

public class Main {

    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void print_transactions(){
        System.out.println("\t 0 - View the transactions");
        System.out.println("\t 1 - View the singers");
        System.out.println("\t 2 - Add the singer");
        System.out.println("\t 3 - Update the singer");
        System.out.println("\t 4 - Delete the singer");
        System.out.println("\t 5 - Search the singer");
        System.out.println("\t 6 - Quit the Program");
    }
    public static void view_singers(){
        singers.print_singers();
    }
    
    public static void add_singer(){
        System.out.println("The name of the singer you want to add: ");
        String name = scanner.nextLine();
        singers.add_singer(name);
    }
    
    public static void update_singers(){
        System.out.println("the position you want to update(1,2,3): ");
        int position = scanner.nextInt();
        scanner.nextLine();
        
        String new_name = scanner.nextLine();
        singers.update_singer(new_name, position-1);
    }
    
    public static void delete_singer(){
        System.out.println("the position you want to delete: ");
        int position = scanner.nextInt();
        singers.delete_singer(position-1);
    }
    
    public static void search_singer(){
        System.out.println("the singer you want to call: ");
        
        String name = scanner.nextLine();
        singers.search_singer(name);
    }
            
    public static void main(String[] args) {
        
        System.out.println("\t Welcome to Singer Application...");
        
        print_transactions();
        boolean exit = false;
        int transaction;
        
        while (!exit) {            
            System.out.println("Choose a transaction: ");
            transaction = scanner.nextInt();
            scanner.nextLine();
            
            switch (transaction) {
                case 0:
                    print_transactions();
                    break;
                case 1:
                    view_singers();
                    break;
                case 2:
                    add_singer();
                    break;
                case 3:
                    update_singers();
                    break;
                case 4:
                    delete_singer();
                    break;
                case 5:
                    search_singer();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the application...");
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
