package buildingblocks.unaryoperator;

public class UnaryOperator2 {
    public static void main(String[] args) {
        int carNumber=10;
        int totalInventory=++carNumber * 3/ carNumber-- + --carNumber;
        // 11*3=33
        // carNumber=11;
        // 33/carNumber--= (carNumber--=33/11=3;
        //carNumber=10;
        //3+9
        carNumber=9;

        System.out.println("Result is "  + totalInventory);
        System.out.println("Car number is " + carNumber);

        int n=4;
        int result=++n + n++ - 5;
        // 5+5-5;
        //5;
        System.out.println("n is " + n);

        int sNumber=13;
        int totalStudentNumber=sNumber++%5* ++sNumber-sNumber--/2;
        // 13%5=3
        //sNumber=14
        //3*15=45
        //sNumber=15
        //45-sNumber--/2
        //sNumber--/2
        //15/2=7
        //sNumber=14
        //45-7=38
        System.out.println(sNumber); //14
        System.out.println(totalStudentNumber);

        int k=8;
        int _result= 5 * k++ - k--/k++ % --k;
        // 5 * 8-9/8 % 8
        // 40 - (1%8)
        // 40-1=39
        // k=9
        // k=8
        // k=9
        // k=8


        System.out.println(k);
        System.out.println(_result);


    }
}
