package operatorsandstatements.forloops;

public class MultipleTermInitialization2 {
    public static void addingMultipleTerms(){
        int x=0;
        for(long y=0,z=4;x<5&&y<10;x++,y++){
            System.out.println(y+"");
        }
    }

    public static void main(String[] args) {
        addingMultipleTerms();
    }
}
