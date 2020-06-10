package exceptions.runtimeexception;
import java.util.Scanner;
public class RuntimeException2 {
    public static void main(String[] args) {
//        int a=5;
//        int b=0;
        //int division=a/b;   // java.lang.ArithmeticException: / by zero


        Scanner input=new Scanner(System.in);
        int num=1;
        do {
            int num1=input.nextInt();
            int num2=input.nextInt();
        // keep asking user to enter two numbers if division is 0;
            try {
                System.out.println("Division of these two numbers is: " + num1 / num2);
                System.out.println("In Try block");
                num=1;
            } catch (Exception e) {
                System.out.println("You can not divide the number by 0");
                num=0;
            }
        }while(num==0);
        System.out.println("Thank you for using my app");
    }
}
