package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    public static void method(){
        List<String> list=new ArrayList<>();
        list.add("Lisa");
        list.add("Kevin");
        list.add("Roger");
        for(int i=0;i<list.size();i++){
            String name=list.get(i);
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(name);
        }

    }

    public static void main(String[] args) {
        method();
    }
}
