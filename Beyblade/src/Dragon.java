public class Dragon extends Beyblade{
    private String specialMonster;
    private String hiddenTalent;

    public Dragon(String specialMonster, String hiddenTalent, String name, int rotationSpeed, int attackPower) {
        super(name, rotationSpeed, attackPower);
        this.specialMonster = specialMonster;
        this.hiddenTalent = hiddenTalent;
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Special Monster Name: "+specialMonster);
        System.out.println("Hidden Talent: "+hiddenTalent);
    }

    @Override
    public void specialMonsterAppears() {
        System.out.println(getName() + " reveals the " + specialMonster );
        System.out.println(getName() + "'s special attack is : Ghost Tornado");
    }
    
}
