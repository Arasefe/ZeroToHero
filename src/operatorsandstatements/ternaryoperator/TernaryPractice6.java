package operatorsandstatements.ternaryoperator;

public class TernaryPractice6 {
    public static void main(String[] args) {
        int y=1;
        int z=3;
        final int x=y<10?y++:--z;
        System.out.println(x);          // 1
        System.out.println(y+","+z);    // 2, 3
        System.out.println("_______________________");
        ternary();


    }
    private static void ternary(){
        int y=1;
        int z=1;
        int x=y<3?y++:++z;          //2,1
        System.out.println(x);
    }
}
