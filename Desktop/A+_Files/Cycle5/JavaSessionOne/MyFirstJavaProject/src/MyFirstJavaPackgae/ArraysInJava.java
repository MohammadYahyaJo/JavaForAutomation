package MyFirstJavaPackgae;

public class ArraysInJava {

    public static void main(String[] args) {
//        // Declaration and initialization
//        int x =0;
//
////        int [] numbersvalues = {1, 2, 3, 4, 5,6 ,7 };
////        String [] Names= {"Mahmood","Mohammad","Ayat","Gahida"};
//
//      //  Index start from 0 …etc.
//// Declaration and later initialization
//
//        int [] Numbers = new int[10];
//        Numbers[0] =11;
//        Numbers[1] = 2;
//
////        int length = Names.length;
////        System.out.println(length);
//
//        int [] numbers = {20, 15, 99, 150,97,15,55,19};
//        for (int i = 0; i <numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        System.out.println("The for loop ended");

            String [] course = {"C#", "C++", "Java", "JavaScript"};

            for(int c = 0; c<course.length;c++){

            System.out.println(course[c]);

        }
            // Print all courses in the array
            System.out.println("All courses:");
            System.out.println(course);

            // Print only Java
            System.out.println(course[3]);

            // Print the length of the array
            System.out.println("\nLength of the array: " + course.length);
        }






    }

