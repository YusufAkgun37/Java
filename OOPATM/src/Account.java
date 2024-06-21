public class Account {
    
    private String ID;
    private String password;
    private int balance;

    public Account(String ID, String password, int balance) {
        this.ID = ID;
        this.password = password;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void deposit(int amount) {
        
        balance += amount;
        System.out.println("New Amount: " + balance);
        
    }
    public void withdrawMoney(int amount) {
        if ((balance - amount) <  0) {
            
            System.out.println("You Don't Have Enough Balance...");
            
        }
        else {
            balance -= amount;
            
            System.out.println("your new balance : " + balance);
            
        }
        
        
    }
    
    
}

