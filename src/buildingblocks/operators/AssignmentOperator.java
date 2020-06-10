package buildingblocks.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        short a=10;
        short b=10;
        //short c=a+b;   it doesn't work.
        a=(short)(a+b);
        System.out.println(a);
    }
        byte a=5;
        byte b=10;
        short c= (short)(a+b);      //byte c upcasted to short c otherwise does not compile

    }

