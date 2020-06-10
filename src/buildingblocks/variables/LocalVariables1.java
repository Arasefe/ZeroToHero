package buildingblocks.variables;

public class LocalVariables1 {
    public static void localMethod(int coffeeQuantity){
        double coffeePrice=2.74;
        double result=coffeePrice*coffeeQuantity;
        System.out.println(result);
    }

    public static void main(String[] args) {
        localMethod(2);
    }
}
