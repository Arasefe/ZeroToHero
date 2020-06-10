package methodsandencapsulation.varargs;

import java.util.Arrays;

public class Binary {
    public static void main(String... args) {
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
        String[][]array=new String[][]{{"no,mo"},{"Moo","noo"}};
        System.out.println(array.length+""+array[0].length);
    }
}
