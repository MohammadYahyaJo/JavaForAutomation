package MyFirstJavaPackgae;


import java.util.Scanner;

public class IfStatmentAssigment {
// slide 25 java
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
       System.out.println("Please Enter your Salary");
        double Salary = scanner.nextDouble();

        if (Salary == 1000){
            double tax = Salary *0.1;
            System.out.println("The tax value is 10% and value  of the  is  " + tax);
        } else if (Salary >1000 && Salary <2000) {
            double tax = Salary * 0.15;
            System.out.println("The tax value is 15% and value is " + tax);
        } else if ( Salary >= 2000) {
            double tax  = Salary * 0.2;
            System.out.println("The tax value is 20% and value is " + tax);
        }else {
            System.out.println("You Don't have to pay Tax");
        }
    }
}
