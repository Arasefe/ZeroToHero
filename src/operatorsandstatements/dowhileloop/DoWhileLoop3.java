package operatorsandstatements.dowhileloop;
import java.util.Scanner;
public class DoWhileLoop3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String name=input.nextLine();
        String reversed= "";
        int length=name.length()-1;

        do {
            reversed+=name.charAt(length);
            length--;

        }while (length>=0);

        System.out.println("Reversed value is " + reversed);
    }
}
