import java.util.Scanner;
public class timestable {
    public static void main(String[] args) throws Exception {
        
        Scanner reader = new Scanner(System.in); 
        System.out.print("What times table would you like? :");
        int number = reader.nextInt();
        for(int i=0; i <= 12; i++)
            System.out.println(number+" * " +i+"="+number*i);
            reader.close();
}
}