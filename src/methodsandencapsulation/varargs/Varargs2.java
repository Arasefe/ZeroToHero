package methodsandencapsulation.varargs;

public class Varargs2 {
    public static void walk(int start, int...nums){
        System.out.println(nums.length);                //0,1,2,3
        System.out.println(start);                      //1,1,1,3
    }

    public static void main(String[] args) {
        //walk(1);
        // walk(1,2);
        // walk(1,2,3);
        walk(3,new int[]{4,5,6});
        walk(5,null);                       //nullPointerException
    }
}
