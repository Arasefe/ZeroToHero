package buildingblocks.primitives;

public class Primitives1 {
    public static void main(String[] args) {
        byte a=127;
        short b=32767;
        int x=(int)1.0;             //casting
        int y=1921222;
        float z=9f;
        long t=2147483648L;
        int g=2147483647;
        short f=(short)1921222;     //numeric overflow occurs and stores 20678
        System.out.println(a+1);
        System.out.println(127+1);
        System.out.println(b+1);
        System.out.println(32767+1);
        System.out.println(f);
        System.out.println(g+1);    //-2147483648
    }

}
