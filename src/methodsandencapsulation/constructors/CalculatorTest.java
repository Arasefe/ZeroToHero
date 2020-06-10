package methodsandencapsulation.constructors;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(4,5));
        System.out.println(Calculator.multiply(23,3345));


        /*
         write a static method in calculator class to accept int num1, int num2, String operator.
         It will return int as a result.
         */

        System.out.println(Calculator.calc(3,8,"*"));
        System.out.println(Calculator.calc(5,5,"!"));       // invalid operator gives "0"


    }
}
