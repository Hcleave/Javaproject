import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three numbers : ");

        int number1 = obj.nextInt();
        int number2 = obj.nextInt();
        int number3 = obj.nextInt();

        System.out.println("The biggest number is " + maxNumber(number1, number2, number3));
        System.out.println("The smallest number is " + minNumber(number1, number2, number3));

    }

    static int maxNumber(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    static int minNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
        
    }
}