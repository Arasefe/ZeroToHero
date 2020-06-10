package buildingblocks.primitives;

public class CAO2 {
    public static void main(String[] args) {
        int x=2;
        int y=3;
        int z=3;
        y=y*x;                  // SIMPLE ASSIGNMENT OPERATOR (6)
        z*=y;                   //3*6=18
        System.out.println(y);  //6
        System.out.println(z);  //18
    }
}
