package methodsandencapsulation.initializationorder;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    private static final String bench;
    private static final String name="name";
    static{
        leftRope="left";
        rightRope="right";

    }
    static{
      //  name="name";
      //  rightRope="right";
        bench="bench";
    }

    public static void main(String[] args) {
       // bench="bench";
    }
}
