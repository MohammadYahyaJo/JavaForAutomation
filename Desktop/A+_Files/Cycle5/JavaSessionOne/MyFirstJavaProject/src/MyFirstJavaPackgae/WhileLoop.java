package MyFirstJavaPackgae;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a value less than 5");
        int count= sc.nextInt();
        while (count <=5)
        {
            System.out.println(count);
            count++;
        }
        System.out.println("The while loop ended");

    }
}
