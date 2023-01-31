public class twodimensionalarray {
    public static void main(String[] args) {
        int[][] integers = new int [2][2];

        integers[0][0] = 3;
        integers[0][1] = 5;
        integers[1][0] = 10;
        integers[1][1] = 2;

        for (int i=0; i<integers.length; i++) {
            for (int j=0; j<integers[i].length; j++) {
                System.out.println(integers[i][j]);;
            }
        }

}
}
