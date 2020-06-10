package corejavaapi.stringpractice;

import java.util.Scanner;

public class ClassroomTask {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your gender, name and DOB with the following structure:" +
                        "Gender- yourFullName- DOB");
        String info=input.nextLine();
        System.out.println("Gender is equals to M" + info.startsWith("M"));
        System.out.println("String contains the name " + info.contains("Ismail YILDIRIM"));
        System.out.println("Last four letter is " + info.substring(info.length()-4));
        System.out.println("DOB is correct or not? " + info.endsWith("1977"));

        // 1-Contains method
        // 2- EndsWith() method
        // 3- Using substring to get the last 4 letters, then store them as a string then using equals method to get the result.



    }
}
