package exceptions.trycatchfinally;

public class TrowExample {
    public static void main(String[] args) {
        try {
            System.out.println("About to throw an Exception");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("In Catch Block");
            return;
        }finally {
            System.out.println("Done with Exception");
        }
    }
}
