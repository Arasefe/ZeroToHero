package corejavaapi.arraypractice;

public class MissingNumberSortedPracticeTwo {
    public static void main(String[] args) {
        /*
        29 to 19 and 21 is missing. The array is ordered.
         */
        int[] numbers = {29, 28, 27, 26, 25, 24, 23, 22, 20, 19};

        for (int i = 0; i<numbers.length; i++) {
            if (i + 29 != numbers[i]) {
                System.out.println(i+29);
                break;
            }
        }
    }
}