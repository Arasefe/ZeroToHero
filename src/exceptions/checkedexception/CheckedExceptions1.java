package exceptions.checkedexception;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptions1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(-5000);
            System.out.println("wake up");
        } catch (InterruptedException e) {          // can write Throwable, and Exception
            System.out.println("In catch block");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}