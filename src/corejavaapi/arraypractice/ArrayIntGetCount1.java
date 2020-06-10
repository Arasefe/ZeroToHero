package corejavaapi.arraypractice;

public class ArrayIntGetCount1 {
    public static void main(String[] args) {
        int []numbers={5,10,15,18,25,35,90};
        int sum=0;
        for (int num:numbers){
            sum+=num;
            System.out.println("for each loop print is " + num);
        }
        System.out.println("The sum of the array is" +sum);
    }
}
