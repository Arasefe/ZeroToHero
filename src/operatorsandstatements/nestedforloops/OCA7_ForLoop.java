package operatorsandstatements.nestedforloops;

public class OCA7_ForLoop {
    public static void forLoopMethod(){
        int count=0;
        for (int row=1;row<=3;row++){
            for (int col=1;col<=2;col++){
                if (row*col%2==0){
                    count++;
                }


            }
        }
        System.out.println(count);


    }

    public static void main(String[] args) {
        forLoopMethod();
    }
}
