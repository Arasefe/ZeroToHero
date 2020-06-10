package operatorsandstatements.forloops;

public class MultipleTermInitialization5 {
    public static void VariablesOutLoop(){
        for (long y=0,x=4;x<5&&y<5;x++,y++){
            System.out.println(y);
        }
        //System.out.println(x); as x is Loop variable we can not use outside the loop. Gives compile time error
    }

    public static void main(String[] args) {
        VariablesOutLoop();
    }
}
