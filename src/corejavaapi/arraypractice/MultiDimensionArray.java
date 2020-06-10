package corejavaapi.arraypractice;

import java.util.Arrays;

public class MultiDimensionArray {

    public static void main(String[] args) {

        int [][] num = new int [3][2];

        num [0][0]= 1;
        num [0] [1] = 2;
        num [1] [0] =3;
        num [1] [1] =4;
        num [2] [0] =5;
        num [2] [1] =6;

        for (int i=0; i<num.length ; i++){
            for(int k=0;k<num[i].length;k++){
                System.out.println(num[i][k]);
            }
            System.out.println(Arrays.toString(num));
        }

    }
}
