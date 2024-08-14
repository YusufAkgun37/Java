
import java.util.ArrayList;
import java.util.Iterator;


public class Controller implements Iterable<String>{
    
    
    public class ControllerIterator implements Iterator<String>{
        
        private int index = 0;
        @Override
        public boolean hasNext() {
            if(index >= channels.size()){
                return false;
            }
            else{
                return true;
            }
        }

        @Override
        public String next() {
            String channel = channels.get(index);
            index++;
            return channel;
        }     
    }
    
    private ArrayList<String> channels = new ArrayList<String>();
    
    public void addChannel(String channel){
        channels.add(channel);
    }
    
    public void removeChannel(String channel){
        if (channels.contains(channel)) {
            channels.remove(channel);
        }
        else{
            System.out.println("There is no such channel...");
        }
        
    }
    
    public int numOfChannels (){
        return channels.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new ControllerIterator();
        
    }
}
