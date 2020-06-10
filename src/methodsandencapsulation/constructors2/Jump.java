package methodsandencapsulation.constructors2;

public class Jump {
    private int rope=2;
    protected boolean outside=true;
    public Jump(){
        this(5);
        outside=true;
    }
    public Jump(int rope){
        this.rope=outside?rope:rope+1;
    }

    public static void main(String[] args) {
        System.out.println(new Jump().rope);
    }
}
