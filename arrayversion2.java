public class arrayversion2 {
    public static void main(String[] args) {

    int [][] numbers = {
        { 90, 75, 80},
        {70 ,56, 75}
    };
    for ( int i=0; i < numbers.length; i++) {
        for ( int j =0; j < numbers[i].length; j++) {
            System.out.print(numbers[i][j]+ " ");

        }
        System.out.println( "");
    }
}
}