package corejavaapi.arraypractice;

public class LowestValueNotSortedArrayIQ {
    public static void main(String[] args) {
        /*
        int array size is 7. It is not sorted. Find the largest value in this array.
         */
        int []numbers={4,56,23,987,29,12,89};
        int lowest=numbers[0];     // first element is presumed as the largest value

        for (int i=1;i<numbers.length;i++){

            if (numbers[i]<lowest){

                lowest=numbers[i];
                System.out.println(numbers[i]);
            }
        }
        System.out.println("The lowest number is " + lowest);
    }
}
