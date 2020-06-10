package operatorsandstatements.conditionstatements;

public class IfStatementsWithOutCurly {
    public static void main(String[] args) {
        if (3 > 4)
            System.out.println("aa");
        System.out.println("bb");
        System.out.println("cc");

        if (3 > 4) {
            System.out.println("aa");
            System.out.println("bb");
            System.out.println("cc");
            if (3 > 4)
                System.out.println("aa");
            System.out.println("bb");
            System.out.println("cc");
            if (3 > 4) {
                System.out.println("aa");
                System.out.println("bb");
                System.out.println("cc");
            }
        }

    }
}
