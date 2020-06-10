package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementFiveDigitNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a 5 digit number");
        int fiveDigitNumber=input.nextInt();         // 67894
        //String newString=""+number;
      // newString.replace(newString.indexOf(0),newString.indexOf(4)
        int numberFive=fiveDigitNumber%10;           // 4
        int fourthValue=fiveDigitNumber/10;          // 6789
        int numberFour=fourthValue%10;               // 9
        int thirdValue=fourthValue/10;               // 678
        int numberThree= thirdValue%10;              // 8
        int secondValue=thirdValue/10;               // 67
        int numberTwo=secondValue%10;                // 7
        int firstValue=secondValue/10;               // 6
        int numberOne=firstValue%10;                 // 6


        int sum=numberFive+numberFour+numberThree+numberTwo+numberOne;
        System.out.println(numberOne+""+numberTwo+""+numberThree+""+numberFour+""+numberFive);

        System.out.println(numberFive+""+numberFour+""+numberThree+""+numberTwo+""+numberOne);

        System.out.println(sum);

        if (numberOne>numberTwo){
            int tem=numberOne;
            numberOne=numberTwo;
            numberTwo=tem;
        }
        if (numberOne>numberThree){
            int tem=numberOne;
            numberOne=numberThree;
            numberThree=tem;
        }
        if (numberOne>numberFour){
            int tem=numberOne;
            numberOne=numberFour;
            numberFour=tem;
        }
        if (numberOne>numberFive){
            int tem=numberOne;
            numberOne=numberFive;
            numberFive=tem;
        }
        if (numberTwo>numberThree){
            int tem=numberTwo;
            numberTwo=numberThree;
            numberThree=tem;
        }
        if (numberTwo>numberFour){
            int tem=numberTwo;
            numberTwo=numberFour;
            numberFour=tem;
        }
        if (numberTwo>numberFive){
            int tem=numberTwo;
            numberTwo=numberFive;
            numberFive=tem;
        }
        if (numberThree>numberFour){
            int tem=numberThree;
            numberThree=numberFour;
            numberFour=tem;
        }
        if (numberThree>numberFive){
            int tem=numberThree;
            numberThree=numberFive;
            numberFive=tem;
        }
        if (numberFour>numberFive){
            int tem=numberFour;
            numberFour=numberFive;
            numberFive=tem;
        }
        System.out.println(numberFive+""+numberFour+""+numberThree+""+numberTwo+""+numberOne);
    }
}
