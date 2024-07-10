public class Problem {
    
    
    public static class Mathematics{
        
        public static void areaOfCircle(int radius){
            System.out.println("Area of circle: " + (Math.PI*radius*radius));
        }
        public static void perimeterOfTriangle(int edge1, int edge2, int edge3){
            System.out.println("Perimeter of Triangle: " + (edge1 + edge2 + edge3));
        }
    }
    public static class Pyhsic{
        
        public static void innerProduct(Vec vec1, Vec vec2){
            int innerProduct = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() +vec1.getK() * vec2.getK();
            System.out.println("Inner product of " + vec1.getName() + " and " + vec2.getName() + " = " + innerProduct);
            
        }
    }
}
