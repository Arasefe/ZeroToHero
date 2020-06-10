package corejavaapi.stringmethods;

public class _1lengthMethod {
    public static void main(String[] args) {
        String str="animals";

        System.out.println(str.length());           // return int number of the length

       // for (int i=0;i<str.length();i++){
           // System.out.println(str.charAt(i));
            for (int j=str.length()-1;j>=0;j--){
                System.out.println(str.charAt(j));

            }
        }
    }
//}
