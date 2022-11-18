public class nestedloop {
    public static void main(String[] args) throws Exception {
        int total = 0;
        for (int i=1; i<5; i++){
            for (int j=1; j<5; j++){
                for (int k=1; k<5; k++){
                    if (!(i== k || + j== k || + i==j))
                    System.out.println(i + " " + j + " " + k);
                        total = (total+1);
                

                
                
            }
        }
}
System.out.println(" There were a total of "+ total + " unique combinations ");
}
}