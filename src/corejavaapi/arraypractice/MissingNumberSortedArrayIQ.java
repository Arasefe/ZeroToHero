package corejavaapi.arraypractice;

public class MissingNumberSortedArrayIQ {
    public static void main(String[] args) {
        /*
        11 to 19 and 17 is missing. The array is ordered.
         */
        int []numbers={11,12,13,14,15,16,18,19};

        for (int i=0;i <numbers.length;i++){
            if (i+11!=numbers[i]){
                System.out.println(i+11);
                break;
            }

    }
    }
}
