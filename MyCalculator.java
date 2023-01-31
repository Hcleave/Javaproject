import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int number1 = number.nextInt();
        int number2 = number.nextInt();
       
        
       System.out.println(number1 + " + " + number2 + " = " +  addNum(number1, number2));
       System.out.println(number1 + " - " + number2 + " = " + subtractnum(number1, number2));
       System.out.println(number1 + " * " + number2 + " = " + timesnum(number1, number2));
        System.out.println(number1 + " / " + number2 + " = " +  dividenum(number1, number2));
    }
    static int addNum (int a, int b) {
            return a+b;
     }

     static int subtractnum(int a, int b) {
         return a - b;
     }

     static int timesnum(int a, int b) {
         return a * b;
     }

     static int dividenum(int a, int b) {
         return a / b;
     }
}