
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        System.out.println("Program to find the exam winner");
        Scanner scanner = new Scanner(System.in);
        
        String transactions = "Transactions...\n"
                + "1. Winner of the Equalweight Division Students\n"
                + "2. Winner of the Numerical Division Students\n"
                + "Press 'q' for exit...";
        System.out.println("*******************************************");
        System.out.println(transactions);
        
        while (true) {            
            System.out.println("Press enter to continue...");
            String answer = scanner.nextLine();
            
            if (answer.equals("q")) {
                System.out.println("Exiting the Program...");      
                break;
            }
            
            //First Student
            System.out.print("Name of the First Student: ");
            String name1 = scanner.nextLine();
            System.out.print("True answers for turkish: ");
            int turkish1 = scanner.nextInt();
            System.out.print("True answers for math: ");
            int math1 = scanner.nextInt();
            System.out.print("True answers for literature: ");
            int literature1 = scanner.nextInt();
            System.out.print("True answers for physic: ");
            int physic1 = scanner.nextInt();
            scanner.nextLine();
            
            //Secons Student
            System.out.print("Name of the Second Student: ");
            String name2 = scanner.nextLine();
            System.out.print("True answers for turkish: ");
            int turkish2 = scanner.nextInt();
            System.out.print("True answers for math: ");
            int math2 = scanner.nextInt();
            System.out.print("True answers for literature: ");
            int literature2 = scanner.nextInt();
            System.out.print("True answers for physic: ");
            int physic2 = scanner.nextInt();
            scanner.nextLine();
            
            //Third Student
            System.out.print("Name of Third Student: ");
            String name3 = scanner.nextLine();
            System.out.print("True answers for turkish: ");
            int turkish3 = scanner.nextInt();
            System.out.print("True answers for math: ");
            int math3 = scanner.nextInt();
            System.out.print("True answers for literature: ");
            int literature3 = scanner.nextInt();
            System.out.print("True answers for physic: ");
            int physic3 = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Choose a transaction: ");
            String transaction = scanner.nextLine();
            
            if (transaction.equals("1")) {
                Equalweight student1 = new Equalweight(turkish1, math1, literature1, physic1,name1);
                Equalweight student2 = new Equalweight(turkish2, math2, literature2, physic2,name2);
                Equalweight student3 = new Equalweight(turkish3, math3, literature3, physic3,name3);
                
                Equalweight winner = winner(student1,student2, student3);
                
                System.out.println("Winner Student of Equalweight : " + winner.getName());
                System.out.println("Point of Student : " + winner.calculatePoints());
            }
            else if (transaction.equals("2")){
                Numerical student1 = new Numerical(turkish1, math1, literature1, physic1, name1);
                Numerical student2 = new Numerical(turkish2, math2, literature2, physic2, name2);
                Numerical student3 = new Numerical(turkish3, math3, literature3, physic3, name3);
                
                Numerical winner = winner(student1, student2, student3);
                
                System.out.println("Winner Student of Numerical : " + winner.getName());
                System.out.println("Point of Student : " + winner.calculatePoints());
            }
            else{
                System.out.println("Invalid trransaction...");
            }
        }
    }
    
    public static <E extends Applicant> E winner(E e1, E e2, E e3){
        if (e1.calculatePoints() > e2.calculatePoints() && e1.calculatePoints() > e3.calculatePoints()) {
            return e1;
        }
        else if (e2.calculatePoints() > e1.calculatePoints() && e2.calculatePoints() > e3.calculatePoints()) {
            return e2;
        }
        else if (e3.calculatePoints() > e1.calculatePoints() && e3.calculatePoints() > e2.calculatePoints()) {
            return e3;
        }
        else{
            return e1;
        }
    }
    
}
