package corejavaapi.multidimensionalarray;

import java.util.Arrays;

public class MultiDimenArray2 {
    public static void method(){
        int [][]num=new int[3][2];
        num[0][1]=12;
        num[1][1]=3;
        num[2][0]=34;

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.println(num[i][j]+"");           //print element
            //    System.out.println();                       // time for a row
            }
        }
        System.out.println(Arrays.toString(num));


    }

    public static void main(String[] args) {
        method();
    }
}
