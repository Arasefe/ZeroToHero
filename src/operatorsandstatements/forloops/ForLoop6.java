package operatorsandstatements.forloops;

public class ForLoop6 {
    public static void main(String[] args) {

        char ch;
        for ( ch='A'; ch<'E'; ch++){
            // System.out.println(ch);         // A    B  C   D
            int number=ch;
            // System.out.print(number);       // 65  66 67  68
            System.out.println(ch + " " + number);
        }
    }
}
