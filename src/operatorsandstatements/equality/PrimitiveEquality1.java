package operatorsandstatements.equality;

public class PrimitiveEquality1 {
    public static void methodEquality(int num1, int num2) {
        if (num1 == num2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        methodEquality(2,2);
    }
}
