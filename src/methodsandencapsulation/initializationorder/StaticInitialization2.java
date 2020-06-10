package methodsandencapsulation.initializationorder;

public class StaticInitialization2 {
    private static int one;
    private static final int two;
    private static final int three=3;
    private static final int four;
    static{
        one=1;
        two=2;
      // three=3; final variables can only be initialized once.
        four=4;
      //  two=3; final variables can only be initialized once.
    }
}
