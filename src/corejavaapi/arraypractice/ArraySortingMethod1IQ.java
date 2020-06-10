package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySortingMethod1IQ {
    public static void main(String[] args) {
        /*
        int temp[0];===>4
        num[0]=num[2];===>1
        num[2]=temp;===>1
         */
        int [] num={4,7,1,25,35,18,22};

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
}

