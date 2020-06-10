package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> bs1=new ArrayList();

        ArrayList<String> bs2=new ArrayList();

        bs1.add("Java OCA Book");
        bs1.add("Agile Project Management");
        bs1.add("Mind Hacking");
        bs1.add("War and Peace");

        bs2.add("Java OCA Book");
        bs2.add("Agile Project Management");
        bs2.add("Mind Hacking");
        bs2.add("War and Peace");

        if (bs1.equals(bs2)){
            System.out.println("Books are the same");
        }else{
            System.out.println("Different Books");
        }

        bs2.set(bs2.indexOf("War and Peace"),"Selenium Book");
        if (bs1.equals(bs2)) {
            System.out.println("Books are the same");
        }else{
            System.out.println("Different Books");

            }
        List<String> studentNames=new ArrayList();
        String [] names={"Kate","Nicole","Mike","Patel","Kushal","Arpan"};
        studentNames= Arrays.asList(names);
        System.out.println(studentNames.get(1));
        List<String>studentName2=Arrays.asList(new String[]{"Patel","Aran"});
        }
    }

