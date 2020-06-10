package exceptions.trycatchfinally;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 15, 25};

        for (int i = 0; i <= nums.length; i++) {
            try {
                System.out.println(nums[i]);        // JVM new ArrayIndexOutOfBoundException();-->throw to JVM
            } catch (Exception e) {                       // Exception e=new ArrayIndexOutOfBoundException();
                                                          // Exception e=new NullPointerException
                System.out.println("You are trying to get " +i+ "index");
                System.out.println(e.getMessage());

            }catch (Throwable e){

            }finally {
                System.out.println("I am in finally");
            }
            System.out.println("After finally");

        }
    }
}