package methodsandencapsulation.passbyvalue;

public class PassByValue4 {
    static int carNumber=10;
    static int num=4;
    public static void updateNumber(int num){
        System.out.println(num);
        num=5;
        System.out.println(num);
    }

    public static void main(String[] args) {
        updateNumber(num);
        System.out.println(num);
        /*
        This is instance variables, java works w=ith pass by value of num will not change.
         */
    }
}
