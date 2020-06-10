package buildingblocks.unaryoperator;

public class UnaryOperator1 {
    public static void main(String[] args) {
     /*   int num1=10;
        System.out.println(num1++);
        System.out.println(num1++);
        System.out.println(++num1);
       */
        int num1=10;

        System.out.println("This is the post increment"+num1++);
        System.out.println("This is the post increment"+num1++);
        System.out.println("This is the pre increment"+ ++num1);
        System.out.println("This is the pre increment"+ ++num1);

    }
}
