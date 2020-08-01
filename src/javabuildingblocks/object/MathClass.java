package javabuildingblocks.object;

public class MathClass {
    public int sum(int a, int b) {
        if (a > b) {
            return a + b;
        }
        return 0;
    }
    public int sum(int ...nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int sum1(int []nums) {        // we have to change the name because varargs is defined as array.
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        MathClass mat=new MathClass();

        int sum=mat.sum(12,12,20,97,245,465);
        int numbers[]={12,12,20,97,245,465};
            System.out.println(mat.sum1(numbers)+" sum from sum1");
            System.out.println(sum+" sum from sum");
            System.out.println(sum+" sum from sum");
    }
}