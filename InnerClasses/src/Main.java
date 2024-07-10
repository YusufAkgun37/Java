
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Mathematic and Pyhsic problems program...");
        
        String transactions = "Transactions...\n"
                + "1. Calculating Area of Circle\n"
                + "2. Calculating Perimeter of Triangle\n"
                + "3. Calculating of 2 vector's Inner Product\n"
                + "Press 'q' for exit...";
        
        while (true) {            
            System.out.println(transactions);
            System.out.print("Choose a transaction: ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("q")) {
                System.out.println("Exiting the program...");
                break;
            }
            
            else if (transaction.equals("1")) {
                System.out.print("Enter a radius for Circle: ");
                int radius = scanner.nextInt();
                scanner.nextLine();
                Problem.Mathematics.areaOfCircle(radius);
            }
            
            else if (transaction.equals("2")) {
                System.out.print("Edge 1: ");
                int edge1 = scanner.nextInt();
                System.out.print("Edge 2: ");
                int edge2 = scanner.nextInt();
                System.out.print("Edge 3: ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Mathematics.perimeterOfTriangle(edge1, edge2, edge3);  
                
            }
            else if (transaction.equals("3")) {
                Vec vec1 = new Vec("Vec1");
                Vec vec2 = new Vec("Vec2");
                Problem.Pyhsic.innerProduct(vec1, vec2);
            }
            
            else{
                System.out.println("Invalid Transaction...");
            }
            
        }
    }
    
    
}
