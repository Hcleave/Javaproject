public class arrayversion3 {
    public static void main(String[] args) {
        String [][] names = { { "John", "Robert", "Simon"},
                            {"Harry", "Jacob"}};
            for (int i = 0; i < names.length; i++) { //index of the row
                 for (int j = 0; j < names[i].length; j++) { //index of the column
                     System.out.println(names[i][j] + " ");
    }
}
    }}