package corejavaapi.arraypractice;

public class ArraySplitMethod1 {
    public static void main(String[] args) {
        /*
       String str= "The method split() splits a String into multiple Strings given the delimiter that separates them.
       The returned object is an array which contains the split Strings.We can also pass a limit to the number of elements in the returned array";
       Get all the words and print the word if the length is less than 4. Use foreach Loop
         */
        String str= "The method split() splits a String into multiple Strings given the delimiter that separates them." +
                    "The returned object is an array which contains the split Strings." +
                     "We can also pass a limit to the number of elements in the returned array";

        String [] words=str.split(" ");

        for(String word:words){
            if (word.length()>5){
                System.out.println(word);
               // System.out.println(Arrays.toString(words));
            }

        }

    }
}
