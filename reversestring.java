import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        System.out.println("this program will reverse a name");   

        Scanner reader = new Scanner (System.in);
        System.out.println("Enter a name");
        char[] letters = reader.nextLine().toCharArray();

        for (int i= (letters.length - 1); i >= 0 ; i--){
            System.out.println(letters[i] + " ");
        }

        System.out.println("The name in reverse");

    }
}
