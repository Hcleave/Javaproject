public class circlecalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleDiameter = 2 * circleRadius;
        double circleCircumference = 2 * Math.PI * circleRadius;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        
        System.out.println("Circle Radius: " + circleRadius);
        System.out.println("Circle Diameter: " + circleDiameter);
        System.out.println("Circle Circumference: " + circleCircumference);
        System.out.println("Circle Area: " + circleArea);
    }
}
