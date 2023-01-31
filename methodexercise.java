public class methodexercise {
    public static void main(String[] args) { //main method        // calling the method and pass on the fnames
        myMethod();
        myMethod("Harry"); // Harry as arguments to pass on        
        myMethod("John");
        myMethod("Lilly");
        myMethod("Ada", "Lovelace");
        myMethod("Severus", "voldemort", "hagrid");   
        }

        static void myMethod() {
            System.out.println("Any name is a good name :D");
        }

        static void myMethod(String fName) {
            System.out.println(fName + " Potter");
        }

        static void myMethod(String fName, String lName) {
            System.out.println(fName + " " + lName);
        }

            static void myMethod (String fName, String mName, String lName){
        System.out.println(fName + " " + mName + " " +lName);
    }
    }