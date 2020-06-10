package buildingblocks.primitives;

public class OperatorPrecedence {
    public static void main(String[]args){

        // *, / and % (Remainder or Module) will be executed before +,-
        int calculate = 10+3/8;  // 3/8=0---->10+0=10,
        System.out.println(calculate);
        double decimalNumber=4/7d;
        System.out.println(decimalNumber);
        int totalNumber= 10*3+4%3-8*2;
        // 10*3= 30,
        // 4%3=1,
        // 8*2=16,
        // 30+1-16=15,
        System.out.println(totalNumber);
        int totalNumber1= 10*(3+4)%(3-8)*2;
        // 3+4=7,
        // 3-8=-5,
        // 10*7%(-5)*2,
        // 70%-5=0,
        // 0*2=0


    }
}
