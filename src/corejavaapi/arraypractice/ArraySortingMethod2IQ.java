package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySortingMethod2IQ {
    public static void method(){
        int num[]={45,32,12,23,3,56,76,34,59,89,8};

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
