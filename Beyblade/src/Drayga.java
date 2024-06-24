public class Drayga extends Beyblade{
    private String specialMonster;

    public Drayga(String specialMonster, String name, int rotationSpeed, int attackPower) {
        super(name, rotationSpeed, attackPower);
        this.specialMonster = specialMonster;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Special Monster Name: "+specialMonster);
    }

    @Override
    public void specialMonsterAppears() {
        System.out.println(getName() + " reveals the " + specialMonster );
        System.out.println(getName() + "'s special attack is : Tiger Paw");
    }
    
}
