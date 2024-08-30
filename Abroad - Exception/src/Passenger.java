
import java.util.Scanner;

class PoliticalException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("You Have Political Ban...");
    }
    
}
class VisaException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("You don't have visa for this country...");
    }
    
}

class FeeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Please pay the overseas fee...");
    }
    
}

public class Passenger {
    
    private int fee;
    private boolean politicalBan;
    private boolean visaStatus;
    
    public Passenger(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("The fee you paid: ");
        this.fee = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Do you have any political bans ? (yes or no): ");
        String pban = scanner.nextLine();
        
        if (pban.equals("yes")) {
            this.politicalBan = true;
        }
        else{
            this.politicalBan = false;
        }
        
        System.out.print("Do you have a Visa ? (yes or no): ");
        String visa = scanner.nextLine();
        
        if (visa.equals("yes")) {
            this.visaStatus = true;
        }
        else{
            this.visaStatus = false;
        }
        
    }

    
    public void abroadFeeControl() throws FeeException {
        if (this.fee < 3000) {
            throw new FeeException();
        }
        else{
            System.out.println("abroad fee completed");
            
        }
    }

    
    public void politicalBanControl() throws PoliticalException {
        if (this.politicalBan == true) {
           throw new PoliticalException();
        }
        else{
            System.out.println("You do not have a political ban...");
            
        }
    }

    
    public void visaStatusControl() throws VisaException {
        if (this.visaStatus == true) {
            System.out.println("Visa procedures completed...");
        }
        else{
            throw new VisaException();
            
        }
    }
    
    
    
}
