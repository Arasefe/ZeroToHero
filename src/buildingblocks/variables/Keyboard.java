package buildingblocks.variables;

public class Keyboard {
    private boolean numLock=true;
    static boolean capLock=false;

    public static void main(String...shortcuts) {
        Keyboard keyboard=new Keyboard();
        System.out.println(keyboard.numLock+""+capLock);
    }
}
