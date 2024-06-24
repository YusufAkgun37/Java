public class BeybladeFactory {
    public Beyblade produceBeyblade(String beyblade_type){
        
        if (beyblade_type.equals("Dragon")) {
            return new Dragon("Blue Dragon", "can talk with special monster", "Takao", 800, 300);   
        }
        else if (beyblade_type.equals("Dranza")) {
            return new Dranza("Red Phoenix", "Kai", 600, 400);
        }
        else if (beyblade_type.equals("Drayga")) {
            return new Dranza("White Tiger", "Rei", 800, 250);
        }
        else if (beyblade_type.equals("Draciel")) {
            return new Dranza("Black Turtle", "Max", 400, 1000);
        }
        else{
            return  null;
        }
    }
}
