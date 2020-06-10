package corejavaapi.arraypractice;

public class ArraySumPractice1 {
    public static void main(String[] args) {
        int [] numbers=new int[4];
        numbers[0]=10;
        numbers[1]=35;
        numbers[2]=45;
        numbers[3]=30;
        numbers[2]=100;
        int nums[]=new int []{200,300,400};

            // loop through the numbers array and calculate the sum of the numbers in array
            // System.out.println(Arrays.toString(numbers));
        int sum=0;
        for (int i=0; i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println("The sum of the number is "+ sum);
        }
    }

