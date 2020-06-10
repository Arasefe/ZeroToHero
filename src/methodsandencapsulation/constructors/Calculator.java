package methodsandencapsulation.constructors;

public class Calculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int calc(int num1, int num2, String operator) {
        if (operator == "+") {
            return sum(num1, num2);
        } else if (operator == "-") {
            return subtract(num1, num2);
        } else if (operator == "*") {
            return multiply(num1, num2);
        } else if (operator == "/") {
            return division(num1, num2);
        } else {
            return 0;
        }
    }
}