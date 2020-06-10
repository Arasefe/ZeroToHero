package classdesign.polymorphism2;

public interface Dad {
    int AGE=25;                      // public static final by default

   public  void feed();

    static void staticMethod(){
        System.out.println("Dad class's static method");
    }

}
