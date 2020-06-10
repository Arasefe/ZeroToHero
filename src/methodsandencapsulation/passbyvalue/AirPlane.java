package methodsandencapsulation.passbyvalue;

public class AirPlane {
    static int start=2;
    final int end;
    public AirPlane(int x){
        x=4;
        end=x;
    }
    public void fly(int distance){
        System.out.println(end-start+"");
        System.out.println(distance);
    }

    public static void main(String[] args) {
        new AirPlane(10).fly(5);
    }
}
