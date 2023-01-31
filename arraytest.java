public class arraytest {
    public static void main(String[] args) {
        int[] carValues = {12000, 34000, 56000, 15450, 45000};

for (int i = 0; i < carValues.length; i++) {
  System.out.println(carValues[i]);
}

carValues[0] = 12670;

for (int i = 0; i < carValues.length; i++) {
  System.out.println(carValues[i]);
}

}
}