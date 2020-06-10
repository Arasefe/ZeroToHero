package methodsandencapsulation.constructors2;

public class Puppy {
    public static int wag=5;
    public static int Puppy(int wag){
        System.out.println(wag);
        return wag;
    }

    public static void main(String[] args) {
        System.out.println(Puppy(2));
    }
}
