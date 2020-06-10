package operatorsandstatements.forloops;

public class ForLoopBreak2 {
    public static void main(String[] args) {
        for ( int i=0; i<10;i++){           // 0,1,2,3,4,5,6,7,8,9
            System.out.println(i);
            if (i==5){                      // 0,1,2,3,4,5
                break;              // It will stop execution of the Loop. In other words,
                                    // it will terminate the Loop as soon as it reaches the condition.
                                    // (The condition will be included while printing)
            }

        }
    }
}
