package operatorsandstatements.forloops;

public class ForLoopContinue1 {
    public static void main(String[] args) {
        for (int i=0; i<5;i++){             // 0,1,2,3,4
            if (i==3){
               // System.out.println(i);      // 0,1,2,3
                break;
            }
           System.out.println(i);           // 0,1,2
        }
    }
}
