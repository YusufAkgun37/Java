
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String transactions = "Transactions...\n"
                +"1. Square Area Calculations\n"
                +"2. Triangle Area Calculations\n"
                +"3. Circle Area Calculations\n"
                +"Press 'q' for quit...";
        
        while (true) {            
            System.out.println(transactions);
            System.out.print("Which shape dou you want to calculate area of: ");
            String shape_type = scanner.nextLine();
            Shape shape = null;
            if (shape_type.equals("q")) {
                System.out.println("Exiting the program...");
                break;
            }
            
            else if (shape_type.equals("1")) {
                System.out.print("Edge of Square: ");
                double edge = scanner.nextDouble();
                scanner.nextLine();
                
                shape = new Square("Square1", edge);
                shape.calculate_area();
            }
            
            else if (shape_type.equals("2")) {
                System.out.print("Edge 1: ");
                double edge1 = scanner.nextDouble();
                System.out.print("Edge 2: ");
                double edge2 = scanner.nextDouble();
                System.out.print("Edge 3: ");
                double edge3 = scanner.nextDouble();
                scanner.nextLine();
                
                shape = new Triangle("Triangle1", edge1, edge2, edge3);
                shape.calculate_area();
            }
            
            else if (shape_type.equals("3")) {
                System.out.print("radius of circle: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();
                shape = new Circle("Circle1", radius);
                shape.calculate_area();
            }
            else{
                System.out.println("Invalid transaction...");
            }
    }
    
  }
    
}