package operatorsandstatements.breakstatement;

public class BreakStatement2 {
    public static void breakStatementMethod(){
        for (int i=0;i<=10;i++){
            for (int j=10;j>=0;j--){
                if(j==5){
                    break;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        breakStatementMethod();
    }
}
