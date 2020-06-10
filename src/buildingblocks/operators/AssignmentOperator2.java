package buildingblocks.operators;

public class AssignmentOperator2 {
    public static void main(String[] args) {
        boolean y=false;
        boolean x=(y=true);
        if(y==x)
            System.out.println("Assignment Operator");
        else
            System.out.println("Else Block");
    }
}
