package operatorsandstatements.ternaryoperator;

public class TernaryPractice7 {
    public static void main(String[] args) {
        int y=3;
        int z=1;
        final int x=y>=10?++y:z++;      //
        System.out.println(y+", "+z);   //3, 2
    }
}
