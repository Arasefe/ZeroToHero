package buildingblocks.casting;

public class OverFlow {
    public static void main(String[] args) {
        int x=2147483647;
        int y=1;
        int z=x+y;
        System.out.println(z);      // -2147483648
        /*
        Since 2147483647 is the maximum int value,
        adding any strictly positive value to it will cause it to wrap to the next negative value.
         */
    }
}
