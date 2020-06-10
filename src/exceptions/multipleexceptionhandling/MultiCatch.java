package exceptions.multipleexceptionhandling;

public class MultiCatch {
    public  int findException() {
        try {

        } catch (ArithmeticException e) {
            return 0;
        } catch (RuntimeException e) {
            return -1;
        } finally {
            System.out.println("done");
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
