import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Create a scanner and a random number generator
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Ask the user for the maximum number to guess
        System.out.print("Enter the maximum number to guess: ");
        int max = scanner.nextInt();

        // Generate a random number between 1 and the maximum number
        int number = rand.nextInt(max) + 1;

        // Print the result
        System.out.println("The number is: " + number);
    }
}
