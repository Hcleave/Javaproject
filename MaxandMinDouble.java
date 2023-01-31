import java.util.Scanner;

public class MaxandMinDouble {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three numbers : ");

        double number1 = obj.nextInt();
        double number2 = obj.nextInt();
        double number3 = obj.nextInt();

        if (number1 % 1 == 0 && number2 % 1 == 0 && number3 % 1 == 0 ) {
        System.out.println("The biggest number is " + maxNumber(number1, number2, number3));
        System.out.println("The smallest number is " + minNumber(number1, number2, number3));
        
        }
    }

    static double maxNumber(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    static double minNumber(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
        
    }
}