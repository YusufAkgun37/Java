
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void press_transactions(){
        
        System.out.print("0- Show the transactions\n"
                + "1- Go to the next city\n" 
                + "2- Go to the previous city\n" 
                + "3- Quit the Program\n");
        
    }
    
    public static void tour_cities(LinkedList<String> cities){
        
        ListIterator<String> iterator = cities.listIterator();
        
        int transaction;
        
        press_transactions();
        
        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext()) {
            System.out.println("There is no city");
        }
        boolean exit = false;
        boolean forward = true;
        
        
        while (!exit) {            
            System.out.print("Choose a transaction: ");
            transaction = scanner.nextInt();
            
            switch (transaction) {
                case 0:
                    press_transactions();
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Going to the city: " +iterator.next());
                    }else{
                        System.out.println("There is no city left to go...");
                        forward = true;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Going to the city: " + iterator.previous());
                    }else{
                        System.out.println("City ​​tour started...");
                    }
                     break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the Application");
                    break;    
            }
        }
    }


    public static void main(String[] args) {
        
        LinkedList<String> cities = new LinkedList<String>();
        
        cities.add("Ankara");
        cities.add("Eskisehir");
        cities.add("Afyon");
        
        tour_cities(cities);
        
    }
    
}
