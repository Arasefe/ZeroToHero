package operatorsandstatements.ternaryoperator;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int y=10;
        int x;
        if(y>5){
            x=2*y;

        }else{
            x=3*y;
        }
        System.out.println("This is coming from if statement " +x);
        System.out.println("+++++++++++++++++++++++");
        ternaryOperator();
    }
    public static void ternaryOperator(){
        int y=10;
        int x=(y>5)?(2*y):(3*y);
        System.out.println(x);
    }

}
