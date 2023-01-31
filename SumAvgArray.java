public class SumAvgArray {
    public static void main(String[] args) {
    int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i : numbers) {
            sum = i + sum;
        }
        System.out.println(sum);

double average = (double) sum/numbers.length;
System.out.println("average is " + average);
        
        
        
}
}