public class Circle extends Shape{
    private double radius;
    
    public Circle(String name,double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculate_area() {
        double area = Math.PI*radius*radius;
        System.out.println("The are of " + getName() + " is: " + area);
    }
    
}
