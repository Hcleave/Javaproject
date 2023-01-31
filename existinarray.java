import java.util.Scanner;

public class existinarray {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);

        int [] numbers = {2, 4, 6, 8, 10};
        System.out.println("Enter a number to search, we will find out if the number exists in the array");
        int usernumber = reader.nextInt();
        
         int Valuefind = 0;
        for(int i = 0; i < numbers.length; i++) {
            if  (usernumber == numbers[i]) {
                    Valuefind++;
            }
        }
        
        if (Valuefind !=0) {
        System.out.println("Value "+ usernumber + " is found in this array.");

            } else {
                System.out.println("Value "+ usernumber + " is not found in this array.");
                }
        
            }
        }
    

