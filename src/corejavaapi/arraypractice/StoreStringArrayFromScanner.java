package corejavaapi.arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class StoreStringArrayFromScanner {
    public static void main(String[] args) {
        /*
        Create one string array to store string values.
        Using Scaner ask the user to provide 6 String values and use Loop to store this values ato the Array.
        David
        John
        Kushal
        Priyanka
        Ajees
        Marcus
         */
        Scanner input= new Scanner (System.in);
        System.out.println("Please enter names of your co-workers");
        String []names=new String [6];
        int i;
        for(i=0;i<names.length;i++){
            names[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(names));




}
}
