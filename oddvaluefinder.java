
    import java.util.Scanner;

public class oddvaluefinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];

    System.out.println("Enter 10 integer values: ");
    for (int i = 0; i < 10; i++) {
      numbers[i] = input.nextInt();
    }

    
    System.out.println("Odd values: ");
    for (int number : numbers) {
      if (number % 2 != 0) {
        System.out.println(number);
      }
    }
  }
}
                           

