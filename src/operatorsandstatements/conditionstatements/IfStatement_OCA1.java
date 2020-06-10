package operatorsandstatements.conditionstatements;

public class IfStatement_OCA1 {
    public static void main(String[] args) {
        int x=4;
        long y=x*4-x++;     //11
        if (y<9) System.out.println("Too low");
        else if(y>12) System.out.println("Too High");
        else System.out.println("Just Right");
    }
}
