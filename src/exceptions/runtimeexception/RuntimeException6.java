package exceptions.runtimeexception;

public class RuntimeException6 {
    public static void main(String[] args) {
       String name=null;
       try{
           int division=10/0;
          int length= name.length();

       }catch (NullPointerException exception) {
           System.out.println("You can not get length of null String");
       }catch (Exception exception){
           System.out.println("There is arithmetic Exception");
       }catch (Throwable exception){
           System.out.println("It is throwing Throwable");
       }

    }
}
