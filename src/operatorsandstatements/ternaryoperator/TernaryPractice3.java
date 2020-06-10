package operatorsandstatements.ternaryoperator;

public class TernaryPractice3 {
    public static void main(String[] args) {
        int a=10;
        int b;
        if(a>5){
            b=a*a;

        }else{
            b=a*a*a;
        }
        System.out.println(b);
        System.out.println("+++++++++++++++++++++++++");
        ternary();
    }
    public static void ternary(){           // Method
        int a=10;
        int b=(a>5)? a*a:a*a*a;
        System.out.println(b);
    }
}
