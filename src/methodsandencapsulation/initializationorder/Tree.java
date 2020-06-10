package methodsandencapsulation.initializationorder;

public class Tree {
    public final static long numberOfTrees;
    public  final static double height;
    public static final short weight;
    public final long initHeight;
    static{}
    {
        initHeight=2;
    }
    static{
        numberOfTrees=10;
        height=5;
        weight=6;

    }
}
