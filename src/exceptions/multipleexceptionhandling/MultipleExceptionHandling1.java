package exceptions.multipleexceptionhandling;

public class MultipleExceptionHandling1 {
    public static void main(String[] args) {
        String number="";                           // convert String number to int primitive
        try{
            int intNum=Integer.parseInt(number);    // empty string converting to int primitive gives NumberFormat Exception
            System.out.println("I am in Try Block");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println("I am in Catch Block");
        }finally{
            System.out.println("Finally Block");    // It will execute in any case
        }
    }
}
