public class Numerical extends Applicant{

    public Numerical(int turkish, int math, int literature, int physic, String name) {
        super(turkish, math, literature, physic, name);
    }

    @Override
    int calculatePoints() {
        return getTurkish()*5 + getMath()*5 + getPhysic()*4 + getLiterature()*1;
    }
    
}
