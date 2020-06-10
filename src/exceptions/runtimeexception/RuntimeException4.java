package exceptions.runtimeexception;

public class RuntimeException4 {
    public static void main(String[] args) {
        String name=null;
        try{
            int length=name.length();
        }catch(Throwable exception){
            System.out.println("You can not get length of null String");
        }
    }
}
