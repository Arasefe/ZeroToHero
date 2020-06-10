package operatorsandstatements.equality;

public class Practice5 {
    public void equals(){
        System.out.println("This is coming from equals () method");

    }


    // create teh method take no parameter and will return practice object

    public static Practice5 createPractice(){
        Practice5 pr=new Practice5();
        return pr;
    }
    public static void main(String[] args) {
        Practice5 practice=new Practice5();
        Practice5 practice1=new Practice5();
        Practice5 practice2=practice;

        System.out.println(practice==practice1);
        System.out.println(practice.equals(practice1));         // Still coming from Object
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println(practice.equals(practice2));
        System.out.println(practice==practice2);

        practice.equals();

        String name="Tima";
        String name1="Tima";
        String name2=new String ("Tima");

        System.out.println(name.equals(name2));                 // true
        System.out.println(name==name1);                        // true

        Integer num=10;
        Integer num1=new Integer(10);

        System.out.println(num==num1);                          // false
        System.out.println(num.equals(num1));                   // true

        Practice5 pr= Practice5.createPractice();



    }
}
