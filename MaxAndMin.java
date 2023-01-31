
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random randomgenerator = new Random();

        int DiceNumber = randomgenerator.nextInt(6) + 1;
        System.out.println(DiceNumber);

}
}