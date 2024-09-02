import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class MultiplicationException extends Exception{

    @Override
    public void printStackTrace() {
         System.out.println("Digit limit exceeded. Please try again with smaller numbers.");
    }
    
}

public class Main {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String transactions = "1. Addition\n"
                          +"2. Subtraction\n"
                          +"3. Multiplication\n"
                          +"4. Division";
        System.out.println(transactions);
        System.out.println("************************************");
        System.out.print("Choose the transaction: ");
        String transaction = scanner.nextLine();
        int a;
        int b;
        
        try {
            switch(transaction){
            case "1":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Result of the transaction : " + (a + b));
                break;
            case "2":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Result of the transaction : " + (a - b));
                break;
            case "3":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                if (a >10000 && b >10000) {
                    throw new MultiplicationException();
                }
                System.out.println("Result of the transaction : " + (a * b));
                break;
            case "4":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Result of the transaction : " + (a / b));
                break;
            default:
                System.out.println("Invalid Transaction...");
  
        }
        } catch (ArithmeticException e) {
            System.out.println("A number cannot be divided by zero.");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter the inputs in the correct form.");
        } catch (MultiplicationException e) {
            e.printStackTrace();
        }
        


        
       
    }
    
}
