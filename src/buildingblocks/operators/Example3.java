package buildingblocks.operators;

public class Example3 {
    public static void main(String[]args){

        int sumOfBits = 12 & 30;
        System.out.println(sumOfBits);
        // 32   16  8   4   2   1
        // 0    0   1   1   0   0
        // 0    1   1   1   1   0

         sumOfBits = 12 | 30;
        System.out.println(sumOfBits);
        // 32   16  8   4   2   1
        // 0    0   1   1   0   0
        // 0    1   1   1   1   0

        int a=5 | 16;
        // 32   16   8  4  2   1
        // 0     1   0  0  0   0
        // 0     0   0  1  0   1
        //21
        System.out.println(a);

        int b=7|37;
        System.out.println(b);
        // 32   16   8  4  2   1
        // 1     0   0  1  0   1
        // 0     0   0  1  1   1
        //39
        int c=7&37;
        System.out.println(c);
        // 32   16   8  4  2   1
        // 1     0   0  1  0   1
        // 0     0   0  1  1   1
        //5
        boolean condition = true & true & true & false ;
        System.out.println(condition);



    }

}
