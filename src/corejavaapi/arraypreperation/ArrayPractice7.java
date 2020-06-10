package corejavaapi.arraypreperation;

import java.util.Arrays;

public class ArrayPractice7 {
    public static void main(String[] args) {
        int[][]array={{3,5,7,9,21},{2,4,6,1,5},{12,14,16,18},{1,2,3}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]+" ");        //print element

            }
           System.out.println();                           //for new row
        }

    }
}
