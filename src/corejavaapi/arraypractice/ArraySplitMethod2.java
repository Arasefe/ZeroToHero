package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySplitMethod2 {
    public static void main(String[] args) {
        /*
        String[] split(String regex, int limit):
        This Java String split method is used when we want the substrings to be limited.
        The only difference between this method and above method is that it limits the number of strings
        returned after split up. Get all the words and print the word if the length is less than 4.
        Use foreach Loop
         */

        String str= "This Java String split method is used when we want the substrings to be limited. " +
                "The only difference between this method and above method is that it limits the number of " +
                "strings returned after split up.";

        String []words=str.split(" ");    // if used "" then each letter is assessed as char
        System.out.println(Arrays.toString(words));

        for (String word:words){
            if (word.length()>5){
                System.out.println(word);       //
            }
        }
    }
}
