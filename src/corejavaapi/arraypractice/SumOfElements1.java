package corejavaapi.arraypractice;

public class SumOfElements1 {
    public static void main(String[] args) {
        /*
        Array of integer element of 10.
        0,1,2,3,4,5,6,7,8,9
        Using loop print two values if their sum is equals to 5
         */
        int i;
        int k;
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (i = 0; i < numbers.length; i++) {
            for (k = i + 1; k < numbers.length; k++) {
                if (numbers[i] + numbers[k] == 8) {

                    System.out.println(numbers[i] + " and " + numbers[k]);
                }
            }
        }
    }
}