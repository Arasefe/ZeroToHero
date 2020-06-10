package operatorsandstatements.foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachContinue {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(8);
        list.add(14);
        list.add(34);
        for(int x:list){                    // data type works as java automatically converts to wrapper Integer
            System.out.println(x + ", ");
            continue;
        }
    }
}
