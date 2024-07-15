package MyFirstJavaPackgae;

public class ForLoop_Multiplication {
    //        public static void main(String[] args) {
//            int i = 2; // Only show multiplication table for 1
//
//            // Print the header for the multiplication table
//            System.out.println("Multiplication table for " + i + ":");
//
//            // Loop to calculate and print multiplication results
//            for (int j = 1; j <= 10; j++) {
//                int result = i * j;
//                System.out.println(result);
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(result);
            }
            System.out.println();


        }

    }
}









