package operatorsandstatements.equality;

public class PrimitiveEquality2 {
    public static void methodEquality(int a,int b) {
        if(a==b){
            System.out.println(a==b);       //true

        }
        if (a!=b){
            System.out.println(a!=b);       //
        }


    }

    public static void main(String[] args) {
        methodEquality(12,12);
    }
}
