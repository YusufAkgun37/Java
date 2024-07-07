public class Square extends Shape{
    private double edge;
    
    public Square(String name,double edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    public void calculate_area() {
        double area = edge*edge;
        System.out.println("The are of " + getName() + " is: " + area);
        
    }
    
}
