package buildingblocks.operators;

public class LogicalOperator2 {
    public static void logicalOperator(){
        boolean x=true, z=true;
        int y=20;
        x=(y!=10)^(z=false);    //Exclusive Or
        System.out.println(x+","+y+","+z);

    }

    public static void main(String[] args) {
        logicalOperator();
    }
}
