package exceptions.runtimeexception;

public class RuntimeException5 {
    public static void main(String[] args) {
        String name=null;
        try{
            int length=name.length();
        }catch(NullPointerException exception){
            System.out.println("You can not get length of null String");

        }catch (ArithmeticException exception){
            System.out.println("There is Arithmetic Exception");
        }
    }
}
