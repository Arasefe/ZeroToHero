package operatorsandstatements.forloops;

public class MultipleTermInitialization4 {
    public static void IncompatibleDataTypes(){
        for (long x=0, y=1;x<5&&y<5;x++,y++){       //for(long x=0,int y=1;x<5&&y<5;x++,y++) DOES NOT COMPILE
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        IncompatibleDataTypes();
    }
}
