





public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Welcome to Sabiha Gokcen Airport...");
        
        String conditions = "Abroad exit conditions...\n"
                +"You must not have any political bans...\n"
                +"You must paid 3131 TL abroad fee...\n"
                +"You must have visa for to the country you are going to...";
        
        String message = "You must meet all international conditions !!! ";
        
        while (true) {            
            System.out.println("**************************************");
            System.out.println(conditions);
            System.out.println("**************************************");
            
            
            Passenger passenger = new Passenger();
            
            System.out.println("Your abroad fees are currently being checked...");
            Thread.sleep(3000);
            if (passenger.abroadFeeControl() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Your political ban is currently being checked...");
            Thread.sleep(3000);
            if (passenger.politicalBanControl() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Your visa status is currently being checked...");
            Thread.sleep(3000);
            if (passenger.visaStatusControl() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Your conditions are complated. You can go abroad...");
            break;
        }
        
    }
    
}
