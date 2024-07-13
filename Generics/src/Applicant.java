public abstract class Applicant {
    
    private String name;
    private int turkish;
    private int math;
    private int literature;
    private int physic;

    public Applicant(int turkish, int math, int literature, int physic, String name) {
        
        this.turkish = turkish;
        this.math = math;
        this.literature = literature;
        this.physic = physic;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTurkish() {
        return turkish;
    }

    public void setTurkish(int turkish) {
        this.turkish = turkish;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getPhysic() {
        return physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }
    
    abstract int calculatePoints();
    
}
