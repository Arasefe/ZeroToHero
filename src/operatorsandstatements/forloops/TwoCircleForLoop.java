package operatorsandstatements.forloops;

import java.util.Scanner;

public class TwoCircleForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of the founder of modern Turkey");
        String founder=input.nextLine();
        System.out.println("Please enter the second name");
        String warrior=input.nextLine();

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter the number of the service years");
        int number=scanner.nextInt();
        int i;
        int k;


        for (i=0;i<=number;i++){                // 0
            System.out.println(founder);        // Mustafa Kemal Ataturk
            for(k=0;k<=number;k++){             // Ismail YILDIRIM, Ismail YILDIRIM,......
                System.out.println(warrior);
            }
        }



    }
}
