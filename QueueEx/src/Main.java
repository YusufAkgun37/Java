
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Queue App...");
        
        Random random = new Random();
        Queue<String> cash_register_queue = new LinkedList<String>();
        
        cash_register_queue.offer("Daniel");
        cash_register_queue.offer("Jacob");
        cash_register_queue.offer("Alfie");
        cash_register_queue.offer("Joseph");
        cash_register_queue.offer("Michael");
        cash_register_queue.offer("William");
        cash_register_queue.offer("Ethan");
        cash_register_queue.offer("Hannah");
        cash_register_queue.offer("Madison");
        cash_register_queue.offer("Emily");
        
        int number_of_product = 1 + random.nextInt(10);
        System.out.println("products are given...");
        System.out.println("Number of Product: " + number_of_product);
        Thread.sleep(3000);
        
        while (number_of_product != 0) {           
            
            System.out.println(cash_register_queue.poll() + " received the product...");
            number_of_product --;
            Thread.sleep(1000);
        }
        System.out.println("Product is out of stock");
    }
    
}
