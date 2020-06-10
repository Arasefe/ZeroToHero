package corejavaapi.arraypractice;

import java.util.Arrays;

public class RemoveDuplicateElements2 {
    public static void main(String[] args) {
        int [] numbers={1,23,5,1,3,5,7};
        int [] removed=new int [numbers.length];
        Arrays.sort(numbers);
        //1,1,2,3,4,5,5,7
        int number=numbers[0];
        removed[0]=number;
        for (int i=1; i<numbers.length;i++){
            if (number!=numbers[i]){
                removed[i]=numbers[i];
            }
            number=numbers[i];
        }
        System.out.println(Arrays.toString(removed));

    }
}
