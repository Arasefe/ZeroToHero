package corejavaapi.wrapperclasses;

public class StringToInt {
    public static void main(String[] args) {
        String num1="22";
        String num2="2";
        String num3="321";
        // Combine these three numbers and store them as int
        // "22","2","321"---->222321
        String combined =num1+num2+num3;

        int result=Integer.valueOf(combined);       //integer

        System.out.println(result);
    }

}
