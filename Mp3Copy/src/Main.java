
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    private static ArrayList<Integer> content = new ArrayList<Integer>();
    
    public static void readFile(){
        try {
            FileInputStream in = new FileInputStream("anthem.mp3");
            
            int read;
            
            while ((read = in.read()) != -1){                
                content.add(read);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void copy(String filename){
        
        try {
            FileOutputStream out = new FileOutputStream(filename);
            
            for (int value: content) {
                
                out.write(value);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args) {
        readFile();
        
        long beginning = System.currentTimeMillis();
        
        copy("anthem2.mp3");
        copy("anthem3.mp3");
        copy("anthem4.mp3");
        
        long finish = System.currentTimeMillis();
        
        System.out.println("Total time : " + (finish-beginning)/1000 + " second");
    }
    
}
