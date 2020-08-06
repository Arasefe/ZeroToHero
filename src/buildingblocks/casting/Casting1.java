package buildingblocks.casting;

public class Casting1 {
    public static void main(String[] args) {
        byte a=40, b=50;            //multiple variable declaration
        byte sum=(byte)(a+b);       //numeric promotion rule number 3. byte+byte-->int but it is casted to byte
        System.out.println("Sum is"+sum);

        byte c=3;
        int d=5;
        int result=c+d;
        System.out.println("The sum is "+result);
    }
}
