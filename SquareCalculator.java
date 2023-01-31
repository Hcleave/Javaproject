import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = reader.nextDouble();
        System.out.print("Enter height: ");
        double height = reader.nextDouble();
        
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        double perimeter = 2 * (width + height);

        System.out.println("Perimeter: " + perimeter);

        double area = width * height;

        System.out.println("Area: " + area);
    }
}
