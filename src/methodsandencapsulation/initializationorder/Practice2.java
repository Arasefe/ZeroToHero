package methodsandencapsulation.initializationorder;

public class Practice2 {
    public static int length=10;
    int tail=3;
    public static void swing(){
        System.out.println("Chimp is swinging");
    }
    static{
        System.out.println("Chimp is static");
    }
    public Practice2(){
        length=20;
        System.out.println("Chimp is constructing");
        System.out.println(length);
        swing();
    }

    public static void main(String[] args) {
        Practice2 pr=new Practice2();
        Practice2 pr2=new Practice2();
    }
}
