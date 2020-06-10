package operatorsandstatements.forloops;

public class MultipleTermInitialization1 {
    public static void main(String[] args) {
        int k=5;
        for (int i=0,p=6; k>1 && i<6;k--,i++){          // k=5,4,3,2    i=0,1,2,3,4,5
            System.out.println(p++);                    // 6,7,8,9
        }
    }
}
