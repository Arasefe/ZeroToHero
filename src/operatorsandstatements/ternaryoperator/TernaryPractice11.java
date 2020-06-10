package operatorsandstatements.ternaryoperator;

public class TernaryPractice11 {
    public static void main(String[] args) {
        int x=10,y=5;
        boolean w=true, z=false;
        x=w?y++:y--;                //y=4
        w=!z;                       //w=true
        System.out.println((x+y)+""+(w?5:10));
    }
}
