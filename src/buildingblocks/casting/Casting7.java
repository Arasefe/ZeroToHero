package buildingblocks.casting;

public class Casting7 {
    public static void castingMethod(){
        byte a=40,b=50;
        byte sum=(byte)(a+b);       // if byte sum=(byte)a+b; DOES NOT COMPILE

    }

    public static void main(String[] args) {
        castingMethod();
    }

}

