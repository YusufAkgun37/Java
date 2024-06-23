public class Manager extends Employee{
    
    private int number_of_people_responsible;

    public Manager(String name, String surname, int id,int number_of_people_responsible) {
        super(name, surname, id);
        this.number_of_people_responsible = number_of_people_responsible;
        
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of people the manager is responsible for: "+number_of_people_responsible);
        
    }
    public void give_a_raise(int raise_amount){
        System.out.println(getName() + " gives to employees " + raise_amount + "€ raise...");
        
    }
    
    
}
