package corejavaapi.arraypractice;

public class LargestValueNotSortedArray2 {
    public static int maxTriple(int[] nums) {
        int i=0;
        int largest=nums[0];
        for(i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        System.out.println("The largest number is "+largest);
        return largest;
    }

    public static void main(String[] args) {
        maxTriple(new int[]{12,23,21,2,3,4232,443344,112,34,4,56});
    }
}
