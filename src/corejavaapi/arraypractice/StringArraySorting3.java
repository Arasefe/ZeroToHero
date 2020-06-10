package corejavaapi.arraypractice;

import java.util.Arrays;

public class StringArraySorting3 {
    public static void methodSort(){
        String []arr={"tahe","out","search","result","should","notice","hash"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        methodSort();
    }
}
