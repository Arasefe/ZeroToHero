package corejavaapi.arraypractice;

public class MissingNumberInNotSortedArrayIQ {
    public static void main(String[] args) {
        /*
        Sequence of int number starting from 0 to 9.
         */
        int []num={0,3,5,7,8,1,4,6,9};
        int total=(9*10)/2;     // (n*n+1)/2
        int sum=0;
        for (int i=0; i<num.length;i++){
            sum+=num[i];
          //  System.out.println(total-sum);
        }
        System.out.println(total-sum);

    }
}
