import java.util.Random;

public class MaxAndMin2 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] myArray = new int[10];

    // Fill the array with random values
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = rand.nextInt(10) + 1;
      System.out.print(myArray[i] + " ");
    }

    // Find the maximum value in the array
    int max = myArray[0];
    int min = myArray[0];

    for (int number : myArray) {
      if (number > max) {
        max = number;
      }
    }

    // Find the minimum value in the array
    for (int number : myArray) {
      if (number < min) {
        min = number;
      }
    }

    // Output the maximum and minimum values
    System.out.println();
    System.out.println("The biggest value is: " + max);
    System.out.println("The smallest value is: " + min);

    for (int number : myArray) {
      if (number % 2 != 0) {
        System.out.println("The odd numbers are " + number);
      }
      if (number % 2 == 0) {
        System.out.println("The even numbers are: " + number);
    }
   

      
    }
  }
}


// extension print the odd and even numbers 