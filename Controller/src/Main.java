
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to the Controller App...");
        Scanner scanner = new Scanner(System.in);
        
        String transactions = "Transactions...\n"
                +"1. Show the Channels\n"
                +"2. Add Channel\n"
                +"3. Remove Channel\n"
                +"4. Show the Number of Channel\n"
                +"5. Press q for Quit...";
        
        Controller controller = new Controller();
        
        while (true) {   
            System.out.println(transactions);
            System.out.print("Enter the transaction: ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("q")) {
                System.out.println("exiting the program...");
                break;
            }
            else if(transaction.equals("1")){
                showChannels(controller);
            }
            else if(transaction.equals("2")){
                System.out.print("Channel to be added: ");
                String channel_name = scanner.nextLine();
                controller.addChannel(channel_name);
            }
            else if(transaction.equals("3")){
                System.out.print("Channel to be removed: ");
                String channel_name = scanner.nextLine();
                controller.removeChannel(channel_name);
            }
            else if(transaction.equals("4")){
                System.out.println("Number of Channel: " + controller.numOfChannels());
            }
            else{
                System.out.println("Invalid Transaction...");
            }
        }
    }
    public static void showChannels(Controller controller){
        
        if (controller.numOfChannels() == 0) {
            System.out.println("No channel found...");
        }
        else{
            for(String channel : controller){
                System.out.println("Channel: " + channel);
                
            }
        }
    }
}
