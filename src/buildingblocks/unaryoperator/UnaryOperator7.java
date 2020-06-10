package buildingblocks.unaryoperator;

public class UnaryOperator7 {
    public static void main(String[] args) {
        int x=3;
        int y=5;
        int z= --x+y*x++ + ++y+x;
        System.out.println(z);
    }
}
