package operatorsandstatements.forloops;

public class ForLoopBreak1 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            System.out.print(i);                       // 0,1,2
            for (char ch='A'; ch<'D'; ch++){
                System.out.print(ch);                  // A B C
                if (ch=='B'){                          // A B (If ch is equal to B then terminates the execution of the Loop.
                    break;                             // it terminates the execution of the Loop
                }

            }
        }
    }
}
