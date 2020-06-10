package exceptions.checkedexception;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("exceptions/file.txt"));
            System.out.println(reader.readLine());      // IOException-->InputOutputException-->Checked Exception
                                                        // Input-->reading
                                                        // Output-->writing
            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("No such line");
        }
    }
}
