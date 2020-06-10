package corejavaapi.wrapperclasses;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer num1=new Integer("22");
        int num1prm=num1;
        num1prm=num1prm+5;
        System.out.println(num1prm);

        Integer num2=Integer.valueOf("1001");
        int num2prm=num2;                       // Unboxing
        /*
        Autoboxing is to convert primitives to Wrapper classes
        int myNum=1;
        Integer myNumWrapper=myNum;
        Unboxing is to convert Wrapper classes to primitives
        Integer num2=Integer.valueOf("1001");
        int num2prm=num2;

         */

        int myNum=1;
        Integer myNumWrap=myNum;                //Autoboxing
        Double double1=Double.valueOf("4.5");
        double double1prm=double1;
        System.out.println(double1);

        Boolean b1=Boolean.valueOf("FALSE");     // works for true and false
        System.out.println(b1);

        boolean b1Prm=b1;                        // Unboxing
        System.out.println(b1Prm);

        Byte byte1=Byte.valueOf("127");
        System.out.println(byte1);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("=============================");

        Integer number1=5;
        Integer number2=10;
        System.out.println(number1+number2);

        System.out.println(number1.equals(number2));

        Boolean boolean1=false;
        Boolean boolean2=false;
        System.out.println(boolean1.equals(boolean2));


        int number3=Integer.parseInt("9");  //int
        System.out.println(number3);

        double number4=Double.parseDouble("3.5");   // double-->Double//Autoboxing
        System.out.println(number4);

        Integer number5=Integer.parseInt("9");  //int--->Integer//Autoboxing...Wrapper classes can not cast
        System.out.println(number3);

        //Double number6=Integer.parseInt("5");  //Int--->Double// casting is not allowed in Wrapper classes
        //System.out.println(number6);
        /*
        ValueOf("123")--> will return Object of Wrapper classes
        Integer.ParseInt("1234") -->will return int primitive;
        Wrapper classes can not cast.
        Integer-->Double will give compilation error.
        int-->double will allow to cast because primitives can cast.
         */

        int number7=Integer.sum(5,145);
        System.out.println(number7);

        int number8=Integer.max(123,345);
        System.out.println(number8);

        int number9=Integer.min(234,345);
        System.out.println(number9);

        int number10=Integer.valueOf(12);
        System.out.println(number10);

    }
}
