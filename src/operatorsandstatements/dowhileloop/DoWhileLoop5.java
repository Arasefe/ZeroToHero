package operatorsandstatements.dowhileloop;

public class DoWhileLoop5 {
    public static void main(String[] args) {
        int y=1;                            //wary of the scope of the variables in do-while loop
        do{

            System.out.println(y++ +" ");
        }while(y<=10);
    }
}
