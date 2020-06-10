package operatorsandstatements.dowhileloop;

public class DoWhileLoop1 {
    public static void DoWhileMethod(){
        int x=0;
        do{
            x++;
        }while(false);
        System.out.println(x);
        /*
        even if the condition is wrong the code runs at least one time
         */

    }

    public static void main(String[] args) {
        DoWhileMethod();
    }
}
