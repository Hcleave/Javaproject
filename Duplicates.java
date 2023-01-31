import java.util.Random;


public class Duplicates {
    public static void main(String[] args) {
    Random randomgenerator =new Random();

    int [] array1 = new int[10];

    for (int i=0; i < array1.length; i++){
        array1[i] = randomgenerator.nextInt(20)+1;
        System.out.print(array1[i] + " ");
    }
    System.out.println(" ");

    int [] array2 = new int[10];

    for (int i=0; i < array2.length; i++){
        array2[i] = randomgenerator.nextInt(20)+1;
        System.out.print(array2[i] + " ");
    }


    System.out.println(" "); 
    System.out.println("The duplicate values are ");
    for(int i= 0; i<array1.length; i++){
        for(int j=0; j < array2.length; j++){
            if (array1[i] == array2[j]) {
                System.out.println(array1[i]);

            }
        }
    }
}
}