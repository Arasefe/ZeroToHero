package operatorsandstatements.foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEach_2 {
    public static void forEach(){
        List<String> values=new ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        values.add("Isaac");
        for (String value:values){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        forEach();
    }
}
