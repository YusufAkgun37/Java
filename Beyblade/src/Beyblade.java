public class Beyblade {
    private String name;
    private int rotationSpeed;
    private int attackPower;

    public Beyblade(String name, int rotationSpeed, int attackPower) {
        this.name = name;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
    public void attack(){
        System.out.println(name + " attacks with " + attackPower + " and " + rotationSpeed);
        
    }
    
    public void specialMonsterAppears(){
        System.out.println("This beyblade doesn't have a special monster...");
        
    }
    
    public void showInfo(){
        System.out.println("Beylade player's name: " + name);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Rotation speed: " + rotationSpeed);
    }
}
