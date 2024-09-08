
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static String gradeCalculation(String name, int midterm1, int midterm2, int final1) {
    
        String output = "";
        
        double totalgrade = (midterm1 * 0.3) + (midterm2 * 0.3) + (final1 * 0.4);
        
        if (totalgrade >= 90) {
            output = name + "got an AA int this lecture";
        }
        else if (totalgrade >= 85) {
            output = name + "got an BA int this lecture";
        }
        else if (totalgrade >= 80) {
            output = name + "got an BB int this lecture";
        }
        else if (totalgrade >= 75) {
            output = name + "got an CB int this lecture";
        }
        else if (totalgrade >= 70) {
            output = name + "got an CC int this lecture";
        }
        else if (totalgrade >= 65) {
            output = name + "got an DC int this lecture";
        }
        else if (totalgrade >= 60) {
            output = name + "got an DD int this lecture";
        }
        else if (totalgrade >= 55) {
            output = name + "got an FD int this lecture";
        }
        else if (totalgrade >= 50) {
            output = name + "got an FF int this lecture";
        }
        return output;
}
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
        FileWriter writer = new FileWriter("Grades.txt")){
            
            while (scanner.hasNextLine()) {                
                String studentsInfo = scanner.nextLine();
                String [] studentArray = studentsInfo.split(",");
                
                int midterm1 = Integer.valueOf(studentArray[1]);
                int midterm2 = Integer.valueOf(studentArray[2]);
                int final1 = Integer.valueOf(studentArray[3]);
                
                String output = gradeCalculation(studentArray[0], midterm1, midterm2, final1);
                writer.write(output + "\n");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
