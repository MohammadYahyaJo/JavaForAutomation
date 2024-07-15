package MyFirstJavaPackgae;

import java.util.Scanner;

public class ExLoopWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int Firstnumber;
        int SecondNumber;
        int sum = 0;
        do {
            System.out.println("Enter a the first  number value to sum it ");
            Firstnumber = scanner.nextInt();
            System.out.println("Enter tge scond number value ");
            SecondNumber = scanner.nextInt();

            sum = Firstnumber + SecondNumber;

            break;
        } while (Firstnumber != 0 || SecondNumber != 0);
        System.out.println("The sum of the numbers entered is: " + sum);
        scanner.close();
    }
}


