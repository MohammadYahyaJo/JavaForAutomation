package MyFirstJavaPackgae;

public class NestedIf {

    public static void main(String[] args) {
        int age = 15;
        if (age>0 ){
            if (age >18){
                System.out.println("Your allowed to Access this website");
            }else {
                System.out.println("You can't access this website");
            }
        }else {
            System.out.println("Please enter valid age");
        }
    }
}
