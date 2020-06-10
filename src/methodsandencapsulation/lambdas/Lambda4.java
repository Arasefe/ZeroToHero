package methodsandencapsulation.lambdas;

public class Lambda4 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Printing from the runnable");
            System.out.println("Line 2");
            System.out.println("This is line 3");
        }).start();
    }
}
