import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        
        Map<Character,Integer> frequency = new TreeMap<Character,Integer>();
        
        for (int i = 0 ; i < sentence.length(); i++) {
            char s = sentence.charAt(i);
            
            if (frequency.containsKey(s)) {
                
                frequency.replace(s, frequency.get(s) + 1);    
                
            }
            else{
                frequency.put(s, 1);
            }
        
        }
        
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("Character: (" + entry.getKey() + ") appears " + entry.getValue() + " times in the sentence.");
            
        }
    }
    
}
