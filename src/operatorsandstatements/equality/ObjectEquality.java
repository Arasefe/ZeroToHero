package operatorsandstatements.equality;

public class ObjectEquality {
    public void equalityMethod(){
        int num=3;
        int num1=3;
        System.out.println(num==num1);  //true;
        num1=4;
        System.out.println(num==num1);  //false;

        String str="car";
        String str1="car";
        System.out.println(str==str1);          // true;
        System.out.println(str.equals(str1));   //true;

        String x="Hello World";
        String y="Hello World";
        System.out.println(x==y);               //true;
        String z=" Hello World".trim();
        System.out.println(x==z);               // false
        String j=new String("Hello World");
        System.out.println(x==j);               //false
        System.out.println(y.equals(j));        //true



        String a= new String("car");
        System.out.println(a==str);             // false;
        System.out.println(a.equals(str));      // true;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        StringBuilder sb1=new StringBuilder("car");
        StringBuilder sb2=new StringBuilder("car");
        //StringBuilder sb3=sb1.append("s");
        System.out.println(sb1==sb2);            //false
        //System.out.println(sb1==sb3);            //true     -->sb1=cars, sb3=cars,
        System.out.println(sb1.equals(sb2));     //false


    }

    public static void main(String[] args) {
        ObjectEquality obj1=new ObjectEquality();
        obj1.equalityMethod();

        ObjectEquality t1= new ObjectEquality();
        ObjectEquality t2= new ObjectEquality();
        ObjectEquality t3=t1;

        System.out.println(t1==t3);
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
    }
}
