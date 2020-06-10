package methodsandencapsulation.constructors2;

public class Puppy1 {
    public static int wag;
    public static int Puppy1(int wag){
        System.out.println(wag);
        return wag;
    }

    public static void main(String[] args) {
        System.out.println(Puppy1(2));
    }
}
