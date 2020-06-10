package exceptions.runtimeexception;

public class RuntimeException7 {
    //Unchecked - Runtime Exception
    public static int convertToInt(String number){
        int result;
        try{
            result=Integer.parseInt(number);            //NumberFormatException
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block of convertToInt method");
        }
        return -1;
    }

    public static void main(String[] args) {
        String[]numbers={"10","5","1A"};
        int []intNums=new int[numbers.length];

        for(int i=0;i<=numbers.length;i++){
            try{
                intNums[i]=convertToInt(numbers[i]);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.exit(0);         // it may be anything
            }finally {
                System.out.println("Finally Block");
            }
        }

    }
}
