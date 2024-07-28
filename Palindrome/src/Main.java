
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        // palindrome with stack
        //kasaylabalyasak
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < sentence.length() / 2; i++){
            stack.push(sentence.charAt(i));
        }
        if (isPalindrome(sentence, stack)) {
            System.out.println("This sentence is palindrome...");
        }
        else{
            System.out.println("This sentence is not palindrome...");
        }
    }
    public static boolean isPalindrome(String sentence, Stack<Character> stack){
        
        for (int i = (sentence.length() / 2) + 1;  i <sentence.length(); i++) {
            
            if (sentence.charAt(i) != stack.pop()) {
                return false;
            }
            
        }
        return true;
        
    }
}
