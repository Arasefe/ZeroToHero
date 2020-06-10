package corejavaapi.stringconcatenation;
/*
If both operands are numeric, + means addition;
if either operand is String, + means concatenation;
The expression evaluated left to right
 */
public class Concat3 {
    public void numericStringMethod(){
        int three=3;
        String four="4";
        System.out.println(1+2+three+four);     //3+3+"4";--->64;
    }

    public static void main(String[] args) {
        Concat3 ct=new Concat3();
        ct.numericStringMethod();
    }
}
