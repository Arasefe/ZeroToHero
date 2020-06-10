package corejavaapi.stringbuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        /*
        String is immutable but StringBuilder is mutable
        Create a String str and using for loop create str value a to z
        and at the end of loop your str should be str=abcde....z;
         */
        String str="";

        for (char i='a'; i<='z';i++){
            str+=i;
            //System.out.println(str);
        }
        System.out.println(str);
    }
}
