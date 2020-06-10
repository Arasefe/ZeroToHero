package corejavaapi.stringbuilder;

public class StringBuilderTask {
    public static void reverseString(String str) {
        StringBuilder builder=new StringBuilder(str);
        builder.reverse();
        System.out.println(builder);

    }
        /*
        Task Create a method taking one String parameter.
        It will reverse value and print the reversed string.
         */
    public static void main(String[] args) {

        reverseString("Close Ally");
    }
}