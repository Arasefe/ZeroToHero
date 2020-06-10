package methodsandencapsulation.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> bunnies=new ArrayList<>();
        bunnies.add("Long Ear");
        bunnies.add("Floopy");
        bunnies.add("Hoppy");
        System.out.println(bunnies);
        bunnies.removeIf(a->a.charAt(0)!='H');
        System.out.println(bunnies);

    }
}
