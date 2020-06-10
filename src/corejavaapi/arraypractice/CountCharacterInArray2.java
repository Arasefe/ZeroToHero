package corejavaapi.arraypractice;

import java.util.Arrays;

public class CountCharacterInArray2 {
    public static void main(String[] args) {
        /*
        Create a  string of array element number is 8. Print all the strings that have 'a' in it and with the
        info of how many numbers of a they have.
        String []sNames={"Murat", "Hasan","Ali", "Selcuk","Huseyin","Mahmut", "Kamil", "Vahit"};
         */
        String []friendNames={"Murat", "Hasan","Ali", "Selcuk","Huseyin","Mahmut", "Kamil", "Vahit" };
        System.out.println(Arrays.toString(friendNames));
        for (String names:friendNames){
            int count=0;

            for (int i=0; i<names.length();i++){
                if (names.charAt(i)=='A'|| names.charAt(i)=='a'){

                    count++;

                }

            }
            System.out.println("A count is "+ count);
        }
    }
}
