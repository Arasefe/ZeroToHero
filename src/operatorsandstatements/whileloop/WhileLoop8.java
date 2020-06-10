package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your five digit number: ");
        int fiveDigitNumber=input.nextInt();        //12345

        int fifthValue= fiveDigitNumber;
        int fifthDigit=fifthValue%10;
        int fourthValue=fifthValue/10;
        int fourthDigit=fourthValue%10;
        int thirdValue=fourthValue/10;
        int thirdDigit=thirdValue%10;
        int secondValue=thirdValue/10;
        int secondDigit=secondValue%10;
        int firstValue=secondValue/10;
        int firstDigit=firstValue%10;
        System.out.println(fifthDigit+"\n"+fourthDigit+"\n"+thirdDigit+"\n"+secondDigit+"\n"+firstDigit);
        System.out.println("=======================================================================");


        int sum=0;
        while(fiveDigitNumber>0){
            int lastDigit=fiveDigitNumber%10;       //5
            System.out.println(lastDigit);
            fiveDigitNumber=fiveDigitNumber/10;     //1234
            sum=sum+lastDigit;                      // finding the sum of the digits (numbers)
        }
        System.out.println(sum);
    }
}

