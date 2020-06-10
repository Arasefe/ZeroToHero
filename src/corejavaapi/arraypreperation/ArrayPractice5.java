package corejavaapi.arraypreperation;

import java.util.Arrays;
public class ArrayPractice5 {
    public static void main(String[] args) {
        int[]numbers={6,9,1,3,29,45};
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+ "");
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
