package buildingblocks.operators;

public class Example1 {
    public static void main(String[]args){
        boolean isJavaFun = false;



        System.out.println(isJavaFun); //positive
        System.out.println(!isJavaFun); //negative !
        // true and true
        System.out.println(true && true);    // true
        System.out.println(true && false);   // false
        System.out.println(false && false);  // false
        System.out.println(false && true);   // false
        System.out.println(true && true && true && false);   // false
        // && all values have to be true in order to get true return
        System.out.println(true || true);   // true
        System.out.println(true || false);   // true
        System.out.println(true || false || false || false || false);   // true




    }
}
