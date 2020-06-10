package operatorsandstatements.forloops;

public class MultipleTermInitialization3 {
    public static void reDeclaringVariable(){
        int x=0;
        long y=10;
        for(y=0,x=4;x<5&&y<10;x++,y++){
            System.out.println(x+"is the value of the for loop. ");
        }
    }

    public static void main(String[] args) {
        reDeclaringVariable();
    }
}
