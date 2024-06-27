
import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singer_list = new ArrayList<String>();
    
    public void print_singers(){
        System.out.println("There are: " + singer_list.size() + " singer");
        
        for(int i = 0 ; i < singer_list.size() ; i++){
            System.out.println((i+1) + ". Singer is: " + singer_list.get(i));     
        }
    }
    
    public void add_singer(String name){
        singer_list.add(name);
        
        System.out.println("Singer list updated...");
    }
    
    public void update_singer(String new_name, int position){
        singer_list.set(position, new_name);
        
        System.out.println("Singer list updated...");
    }
    
    public void delete_singer(int position){
        String name = singer_list.get(position);
        singer_list.remove(position);
        
        System.out.println(name + "deleted...");
    }
    
    public void search_singer(String singer_name){
        int position = singer_list.indexOf(singer_name);
        
        if (position >= 0) {
            System.out.println("Singer is found");
            System.out.println(" The singer named:  " + singer_name + " is in " + (position+1) + ". position");   
        }
        else{
            System.out.println("Singer not found...");
        }
    }
}
