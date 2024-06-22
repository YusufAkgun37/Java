
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Training Program...");
        
        String trainings = 
                "Valid Moves...\n"
                +"pullup\n"
                +"pushup\n"
                +"situp\n"
                +"squat\n";
        System.out.println(trainings);
        
        System.out.println("Create a training program...");
        System.out.print("Number of Pullup: ");
        int pullup = scanner.nextInt();
        System.out.print("Number of Pushup: ");
        int pushup = scanner.nextInt();
        System.out.print("Number of Situp: ");
        int situp = scanner.nextInt();
        System.out.print("Number of Squat: ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Training training = new Training(pullup, pushup, situp, squat);
        System.out.println("Training Starting...");
        
        while (training.isTrainingFinish()== false) {            
            System.out.print("Move Type(pullup,pushup,situp,squat): ");
            String type = scanner.nextLine();
            System.out.print("How many reps you will do? ");
            int rep = scanner.nextInt();
            scanner.nextLine();
            
            training.make_a_move(type, rep);
        }
        System.out.println("You finished the training successfully...");
    }
}
