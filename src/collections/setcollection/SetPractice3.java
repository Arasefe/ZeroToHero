package collections.setcollection;

import java.util.*;

public class SetPractice3 {
    public static void addAllMethod(){
        Set<Integer> list=new HashSet<>();      //list
        List arrList=new ArrayList();           // arrList


        arrList.add(20);
        arrList.add(30);
        arrList.add(30);
        arrList.add(40);                        // 20,30,40

        list.add(10);
        list.add(20);
        list.add(30);                           //10,20,30

        list.addAll(arrList);                   //10,20,30,40

        System.out.println(list);               //10,20,30
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(arrList);

      //Iterator i=list.iterator();     //Iterator<Integer>new HashSet<>();

       for (Integer lis:list){
           if(lis==10){
               System.out.println(lis);
            }
        }


    }

    public static void main(String[] args) {
        addAllMethod();
    }

}
