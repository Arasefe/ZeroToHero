package corejavaapi.arraypractice;

public class ReverseStringCharsInArray1 {
    public static void main(String[] args) {
        /*Create an array of 5 to store the string value.
        Print every String from last char to first char.
         */
        String []names={"Tech", "Array", "Polygamy", "Loyalty","Excuse"};
        for (String name:names){
            for (int i=name.length()-1;i>=0;i--){
               char ch= name.charAt(i);
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}
