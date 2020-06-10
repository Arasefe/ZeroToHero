package operatorsandstatements.dowhileloop;
import java.util.Scanner;
public class DoWhileLoop4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the string that you want to reverse:");
        String str=input.nextLine();

        String reversed="";
        int length=str.length()-1;
        do{
            reversed+=str.charAt(length);
            length--;
        }while (length>=0);
        System.out.println("The reversed value of the string is : " + reversed);


    }
}
