package corejavaapi.arraypreperation;

import javax.imageio.stream.ImageInputStream;

public class ArrayPractice11 {
    public static void main(String[] args) {
        int[] numbers = {75, 29, 350, 7, 4192, 204, 88, 67};
        //int i = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            // count all numbers over 100
            if (numbers[i] > 100) {
                count++;
                sum += numbers[i];

            }
            System.out.println(count);
            System.out.println(sum);

        }

    }
}

