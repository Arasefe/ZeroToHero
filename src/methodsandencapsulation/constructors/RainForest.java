package methodsandencapsulation.constructors;

public class RainForest extends Forest{
    public RainForest(long treeCount){
        super(2);
        this.treeCount=treeCount+1;
    }

    public static void main(String[] args) {
        System.out.println(new RainForest(5).treeCount);
    }
}
