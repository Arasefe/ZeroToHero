package operatorsandstatements.switchstatement;

import java.util.Scanner;
public class SwitchStatement7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of the week days");
        int numberOfWeekDays=input.nextInt();
        switch (numberOfWeekDays){
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

        }

    }

}
