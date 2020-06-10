package exceptions.tryfinally;

public class ExceptionTest {
    public static void main(String[] args) {
        String name=null;
        try{
            System.out.println(name.length());              // Exception in thread "main" java.lang.NullPointerException

        }finally {
            System.out.println("If there is no catch block, finally block runs for sure on behalf");
        }

    }
}
