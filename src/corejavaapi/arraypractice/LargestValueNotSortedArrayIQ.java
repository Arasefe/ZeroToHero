package corejavaapi.arraypractice;

public class LargestValueNotSortedArrayIQ {
    public static void main(String[] args) {
        int a=largestValue(new int[]{4, 2, 56, 23, 987, -999, 1, 29, 12, 89});
        System.out.println(a);
    }

    public static int largestValue(int[]numbers) {
         /*
        int array size is (length) It is not sorted.
        Find the largest value in this array.
         */
        int largest = numbers[0];                     // first element is presumed as the largest value

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest value in the array is " + largest);
        return largest;
    }
}
