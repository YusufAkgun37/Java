public class Equalweight extends Applicant{

    public Equalweight(int turkish, int math, int literature, int physic, String name) {
        super(turkish, math, literature, physic, name);
    }

    @Override
    int calculatePoints() {
       return getTurkish()*5 + getMath()*5 + getLiterature()*4 + getPhysic()*1;
    }
    
}
