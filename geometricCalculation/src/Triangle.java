public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(String name,double a,double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculate_area() {
        double u = (a + b + c)/ 2.0;
        
        double area = Math.sqrt (u * (u - a) * (u - b) * (u - c));
        System.out.println("The are of "  + getName() + " is: " + area);
    }
    
}
