package buildingblocks.operators;

public class LogicalOperator3 {
    public static void main(String[] args) {
        int x=3;
        int y=4;

        boolean result = (x>y & x++ > y);
        System.out.println(x);
    }
}
