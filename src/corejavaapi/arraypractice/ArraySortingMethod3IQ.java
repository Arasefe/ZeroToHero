package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySortingMethod3IQ {
    public static void method(){
        int[]num={21,23,434,453,43,23,45,56,745,234};


        for (int i=0;i<num.length;i++){
            int temp=0;
            for (int k=i+1;k<num.length;k++){
                if (num[i]>num[k]){
                    temp=num[i];
                    num[i]=num[k];
                    num[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));

    }

    public static void main(String[] args) {
        method();
    }
}
