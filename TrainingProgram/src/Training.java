public class Training {
    private int num_of_pullup;
    private int num_of_pushup;
    private int num_of_situp;
    private int num_of_squat;

    public Training(int num_of_pullup, int num_of_pushup, int num_of_situp, int num_of_squat) {
        this.num_of_pullup = num_of_pullup;
        this.num_of_pushup = num_of_pushup;
        this.num_of_situp = num_of_situp;
        this.num_of_squat = num_of_squat;
    }

    public int getNum_of_pullup() {
        return num_of_pullup;
    }

    public void setNum_of_pullup(int num_of_pullup) {
        this.num_of_pullup = num_of_pullup;
    }

    public int getNum_of_pushup() {
        return num_of_pushup;
    }

    public void setNum_of_pushup(int num_of_pushup) {
        this.num_of_pushup = num_of_pushup;
    }

    public int getNum_of_situp() {
        return num_of_situp;
    }

    public void setNum_of_situp(int num_of_situp) {
        this.num_of_situp = num_of_situp;
    }

    public int getNum_of_squat() {
        return num_of_squat;
    }

    public void setNum_of_squat(int num_of_squat) {
        this.num_of_squat = num_of_squat;
    }
    public void make_a_move(String moveType, int rep){
        if (moveType.equals("pullup")) {
            doPullup(rep);
        }
        else if(moveType.equals("pushup")){
            doPushup(rep);
        }
        else if(moveType.equals("situp")){
            doSitup(rep);
        }
        else if(moveType.equals("squat")){
            doSquat(rep);
        }
        else{
            System.out.println("invalid moveType");
        }
    }
    
    public void doPullup(int rep){
        if(num_of_pullup == 0){
            System.out.println("Finish...");
        }
        if (num_of_pullup - rep <0) {
            System.out.println("congratulations you did more reps...");
            num_of_pullup = 0;
            System.out.println("number of pullups remaining: "+num_of_pullup);
        }
        else{
            num_of_pullup -= rep;
            System.out.println("number of pullups remaining: "+num_of_pullup);    
        }
    }
    public void doPushup(int rep){
        if(num_of_pushup == 0){
            System.out.println("Finish...");
        }
        if (num_of_pushup - rep <0) {
            System.out.println("congratulations you did more reps...");
            num_of_pushup = 0;
            System.out.println("number of pushup remaining: "+num_of_pushup);
        }
        else{
            num_of_pushup -= rep;
            System.out.println("number of pushup remaining: "+num_of_pushup);    
        }
    }
    public void doSitup(int rep){
        if(num_of_situp == 0){
            System.out.println("Finish...");
        }
        if (num_of_situp - rep <0) {
            System.out.println("congratulations you did more reps...");
            num_of_situp = 0;
            System.out.println("number of situp remaining: "+num_of_situp);
        }
        else{
            num_of_situp -= rep;
            System.out.println("number of situp remaining: "+num_of_situp);    
        }
    }
    public void doSquat(int rep){
        if(num_of_squat == 0){
            System.out.println("Finish...");
        }
        if (num_of_squat - rep <0) {
            System.out.println("congratulations you did more reps...");
            num_of_squat = 0;
            System.out.println("number of squat remaining: "+num_of_squat);
        }
        else{
            num_of_squat -= rep;
            System.out.println("number of squat remaining: "+num_of_squat);    
        }
    }
    public boolean isTrainingFinish(){
        return (num_of_pullup == 0 && num_of_pushup == 0 && num_of_situp == 0 && num_of_squat == 0);
    }
    
}
