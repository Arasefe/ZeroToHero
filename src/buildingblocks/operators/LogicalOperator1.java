package buildingblocks.operators;


public class LogicalOperator1 {
    public static void main(String[] args) {
        int x=6;
        boolean y=(x>=6)||(++x<=7);
        System.out.println(y);
        System.out.println("+++++++++++++++++++++++++++++++");
        LogicalOperator1();
        LogicalOperator2();

    }

    public static void LogicalOperator1(){
        boolean y=false;
        boolean x=(y=true);
        System.out.println(x);
    }
    public static void LogicalOperator2(){
        boolean x=true;
        boolean y=false;
        boolean z=(x&y)||(x|y);     // false||true
        System.out.println(z);      // true
    }

}
