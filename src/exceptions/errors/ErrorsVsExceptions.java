package exceptions.errors;

public class ErrorsVsExceptions {
    public static void run() {
        run();
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (StackOverflowError e) {
            System.out.println("Stack Over Flow");
        }
    }
}