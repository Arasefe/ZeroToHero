package operatorsandstatements.forloops;

public class ForLoop5 {
    public static void main(String[] args) {
        String str="Techtorial";
        for (int i = 0; i<str.length(); i++){
            //System.out.println(str);

            str=str.replace(str.charAt(i),'a');

            System.out.println(str);
        }
    }
}
