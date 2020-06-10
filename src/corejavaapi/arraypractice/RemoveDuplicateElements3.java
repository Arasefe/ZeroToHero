package corejavaapi.arraypractice;

public class RemoveDuplicateElements3 {
    public static void main(String[] args) {
        /*
        int [] numbers={1,2,54,5,1,3,54,7};
        int [] removed=new int [numbers.length];
        Arrays.sort(numbers);
        //1,1,2,3,4,5,5,7
        int number=numbers[0];
        removed[0]=number;
        for (int i=1; i<numbers.length;i++){
            if (number!=numbers[i]){
                removed[i]=numbers[i];
            }
            number=numbers[i];
        }
        System.out.println(Arrays.toString(removed));

         */
        int numbers[] = {1, 2, 54, 5, 1, 3, 54, 7};
        int L = numbers.length;
        int i = 0;
        for (i = 0; i < L; i++) {
//            System.out.println(numbers[i]+" ");
//            System.out.println();
            for (i = 0; i < L - 1; i++) {
                for (int k = i + 1; k < L; k++) {
                    if (numbers[i] == numbers[k]) {
                        numbers[i] = numbers[L - 1];
                        L--;
                    }
                }
            }
            System.out.println(numbers[i]);
        }
    }
}
