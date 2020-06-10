package corejavaapi.arraylist;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();     // store only String Wrapper classes not primitive Data Types
        list.add("Java");
        list.add("C#");
        list.add("Phyton");

        ArrayList<Integer>numbers=new ArrayList();
        numbers.add(55);
        numbers.add(64);
        numbers.add(24);
        numbers.add(11);
        numbers.add(84);
        numbers.add(7);
        numbers.add(16);
        for (Integer number:numbers){
            if (number%2==0){
                System.out.println(number+ " is even number from foreach Loop ");
            }
            else{
                System.out.println(number+ "is odd number from foreach Loop");
            }
        }
        for (int i=0;i<numbers.size();i++){
                if(numbers.get(i)%2==0){
                    System.out.println("This "+ numbers.get(i)+"is even number from for Loop");
        }
                else{
                    System.out.println("This "+ numbers.get(i)+"is odd number from for Loop");
                }
        }
        ArrayList<String>sList=new ArrayList();
        sList.add("Milk");
        sList.add("Cereal");
        sList.add("Carrot");
        sList.add("Coffee");
        sList.add("Sugar");                                 //Yoghurt
        sList.add("Bread");
        sList.set(4,"Yoghurt");
        System.out.println(sList);
        for(String ls:sList)
            System.out.print(ls+"\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        sList.set(sList.indexOf("Coffee"),"Tea");           // To replace an unknown index number of a
        System.out.println(sList);

        System.out.println(sList.contains("Bread"));
        sList.remove("Milk");
        System.out.println(sList);

        System.out.println(sList.isEmpty());

        sList.clear();                                       // Clears the ArrayList
        System.out.println(sList);

        if (sList.isEmpty()){
            System.out.println("Done");
        }else{
            System.out.println("Keep shopping");
        }
    }
}

