package methodsandencapsulation.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {

    public void perform(Greeter greeter){
        greeter.greeting();
    }
    public static void main(String[] args) {
        Lambda1 lambda1 = new Lambda1();
        GreeterImplementation greeterImplementation = new GreeterImplementation();
        lambda1.perform(greeterImplementation);

        Greeter myBlockCode = () -> System.out.println("Hello Java");

        CustomInterface anotherBlockOfCode=  (String id)->12;   // If it is single line and you want to remove {} you have to remove return


                                                                 // if you have more then one parameter you have to have paranthesis

            List<String> list=new ArrayList<>();
            list.add("Ismail");
            list.add("Banu");
            list.add("Aras");
            list.add("Efe");
            list.add("Tulpar");

            for(String str:list){
                System.out.println(str);
            }
        list.forEach(element-> System.out.println(element));
        }
        //predicate
        //Callable
        //Consumer
        //Runnable

    }

