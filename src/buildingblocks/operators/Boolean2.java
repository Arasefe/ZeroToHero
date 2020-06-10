package buildingblocks.operators;

public class Boolean2 {
    public static void booleanMethod(){
        int x1=50,x2=75;
        boolean b=x1>=x2;
        if (b==true) System.out.println("success");
        else System.out.println("failure");
    }

    public static void main(String[] args) {
        booleanMethod();
    }
}
