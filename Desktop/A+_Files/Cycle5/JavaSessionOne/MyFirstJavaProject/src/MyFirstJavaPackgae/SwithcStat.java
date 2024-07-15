package MyFirstJavaPackgae;

import java.util.Scanner;

public class SwithcStat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a value");
        String grade = scanner.next();
        switch (grade) {

            case "one":
                System.out.println("The value is one");
                break;
            case "two":
                System.out.println("The value is two");
                break;
            case "Three":
                System.out.println("The value is Three");
                break;
            case "four":
                System.out.println("The value is Four");
        }
    }

}
