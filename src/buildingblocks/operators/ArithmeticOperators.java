package buildingblocks.operators;

public class ArithmeticOperators {
    public static void main (String[]args){
        int currentSpeed=45;
        int speedLimit=30;
        // 45<30---->false
        boolean increaseSpeed=currentSpeed<currentSpeed;
        System.out.println(increaseSpeed);
        //45>30-------->TRUE
        boolean decreaseSpeed =currentSpeed>speedLimit;
        System.out.println("Increase your speed: " + increaseSpeed);
        System.out.println("Decrease your speed: " + decreaseSpeed);







        System.out.println();

    }
}
