package operatorsandstatements.breakstatement;

public class BreakStatement1 {
    public static void breakStatementMethod(){
        for (int a=0;a<=4;a++){
                if (a==2){
                    break;
            }
            System.out.println("This is a "+ a);
        }

    }

    public static void main(String[] args) {
        breakStatementMethod();
    }
}
