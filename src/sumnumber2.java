import java.util.Scanner;
public class sumnumber2 {
    public static void main(String[] args) throws Exception {
       int x = 0;
        while (x<10){
        System.out.println(x);
        x++;
        }
        Scanner reader = new Scanner(System.in);
       System.out.println("What word do you want to store?");
       System.out.println("the word is " + reader.nextLine());

}
}