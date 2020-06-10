package methodsandencapsulation.passbyvalue;

public class PassByValue2 {
    public static double updateDouble(double bl){
        bl=bl*10%5;
        //This method will return manipulated value. However, it will return double.
        return bl;
    }

    public static void main(String[] args) {
        updateDouble(15.60);
        System.out.println(updateDouble(15.60));
        // If you want to change the original value, need to reassign it again
    }
}
