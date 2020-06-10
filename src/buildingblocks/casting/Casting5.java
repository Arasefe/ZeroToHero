package buildingblocks.casting;

public class Casting5 {
    public static void main(String[] args) {
        byte number1 = 7;
        short number2 = 30;
        short result = (short) (number1 * number2);
        System.out.println("Result is : " + result);
        alternate();
        alternate1();
        alternate2();
    }

    public static void alternate() {
        byte number1 = 7;
        short number2 = 30;
        byte result = (byte) (number1 * number2);
        System.out.println("Result is: " + result);
    }

    public static void alternate1() {
        int number = (int) 4.9;
        System.out.println("The result is :" + number);
    }

    public static void alternate2() {
        short x=6;
        short t=8;
        x+=t;
        System.out.println("Result is : " + x);

    }
}
