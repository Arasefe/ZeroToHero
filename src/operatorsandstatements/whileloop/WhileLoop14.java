package operatorsandstatements.whileloop;

public class WhileLoop14 {
    public static void ArrayWhileLoop() {

        int arr[] = {2, 11, 45, 9};
        //i starts with 0 as array index starts with 0 too
        int i = 0;
        while (i < 4) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        ArrayWhileLoop();
    }
}
