import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    
    /*
    3 ---> highest priority
    2 ---> medium priority
    1 ---> lowest priority
    */

    public static void main(String[] args) {
        
            Queue<Patient> emergencyroom = new PriorityQueue<Patient>();
            emergencyroom.offer(new Patient("Jhon Jones","burn"));
            emergencyroom.offer(new Patient("Josh Quinlan","head ache"));
            emergencyroom.offer(new Patient("Miguel Baeza","appendicitis"));
            emergencyroom.offer(new Patient("Emily Ducote","burn"));
            emergencyroom.offer(new Patient("Josiah Harrell","burn"));
            emergencyroom.offer(new Patient("Nick Diaz","appendicitis"));
            
            int i = 1;
            
            while (emergencyroom.isEmpty() != true) {            
            
                System.out.println("*******************************");
                System.out.println(i + ".place");
                System.out.println(emergencyroom.poll());
                System.out.println("*******************************");
                i++;
        }
    }
    
}
