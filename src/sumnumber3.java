import java.util.Scanner;
public class sumnumber3 {
    public static void main(String[] args) throws Exception {
     Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum too");


        int sumTotal = 0;
int sumTo = reader.nextInt();
int i = 1;

while(i<=sumTo){
sumTotal += i;
i++;
}
System.out.println("the sum is " + sumTotal);
reader.close();
        }
        
       
}
