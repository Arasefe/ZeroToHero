package corejavaapi.arraypractice;

import java.util.Arrays;

public class StringArraySorting1 {
    public static void main(String[] args) {
        int[]arr={1,5,3,10,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);       // it will sort the array from smallest to largest. For String order will be alphabetical order
        System.out.println(Arrays.toString(arr));
        /*
         Create another array and store the arr values, largest to smallest
         Arrays.sort(arrayName);
         Smallest to Largest (sort() method)
         int [] arr={1,3,5,8,10};
         Largest to Smallest
         int largestSmallest= new int [arr.length];         // 5
         {10,0,0,0,0}
         largestSmallest[0]=arr[4]
         largestSmallest[1]=arr[3]
         largestSmallest[2]=arr[2]
         largestSmallest[3]=arr[1]
         largestSmallest[4]=arr[0]
         */

        int[] largestSmallest= new int [arr.length];

        for(int i=0, k=arr.length-1;i<arr.length;i++,k--){
            largestSmallest[i]=arr[k];
        }
        System.out.println("Largest to smallest order" + Arrays.toString(largestSmallest));
    }
}
