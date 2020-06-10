package corejavaapi.arraypreperation;

import java.util.Arrays;

public class ArrayPractice13 {
    public static void stringArrayMethod(){
        String [] mammals={"monkey","chimp","donkey"};
        String [] reversed=new String[mammals.length];
        System.out.println(mammals.length); //3
        System.out.println(mammals[0]);     //monkey
        System.out.println(mammals[1]);     //chimp
        System.out.println(mammals[2]);     //donkey
        for(int i=0,k=2;i<mammals.length;i++,k--){
            reversed[k]=mammals[i];
            System.out.println(reversed[k]);
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void main(String[] args) {
        stringArrayMethod();
    }
}
