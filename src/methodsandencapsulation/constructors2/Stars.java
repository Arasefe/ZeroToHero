package methodsandencapsulation.constructors2;

public class Stars {
    private int inThe=4;
    public  Stars(){
        super();
    }
    public Stars(int inThe){
        this.inThe=inThe;
    }

    public static void main(String[] args) {
        System.out.println(new Stars(2).inThe);
    }
}
