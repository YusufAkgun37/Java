public class Programmer extends Employee{
    
    private String languages;


    public Programmer(String languages, String name, String surname, int id) {
        super(name, surname, id);
        this.languages = languages;
    }
    
    public void formatting(String operating_system){
        System.out.println(getName() + " is installing " + operating_system + "...");
        
    }

    @Override
    public void showInformation() {
        super.showInformation(); 
        System.out.println("Languages that known the programmer: "+languages);
    }
    
}
