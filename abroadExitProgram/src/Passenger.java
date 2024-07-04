
import java.util.Scanner;

public class Passenger implements AbroadRules{
    
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

    @Override
    public boolean abroadFeeControl() {
        if (this.fee < 15) {
            System.out.println("You paid incomplete fee...");
            return false;
        }
        else{
            System.out.println("abroad fee completed");
            return true;
        }
    }

    @Override
    public boolean politicalBanControl() {
        if (this.politicalBan == true) {
            System.out.println("You have political ban. You cannot go abroad...");
            return false;
        }
        else{
            System.out.println("You do not have a political ban...");
            return true;
        }
    }

    @Override
    public boolean visaStatusControl() {
        if (this.visaStatus == true) {
            System.out.println("visa procedures are completed...");
            return true;
        }
        else{
            System.out.println("You need to complete visa procedures...");
            return false;
        }
    }
    
    
    
}
