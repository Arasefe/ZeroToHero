package methodsandencapsulation.varargs;

public class Varargs3 {
    public static void run(int...nums){
        int total=nums[1]+nums[3];
        System.out.println(nums[1]);            //15
        System.out.println(total);              //15
    }

    public static void main(String[] args) {
        run(11,15,18,0);
    }
}
