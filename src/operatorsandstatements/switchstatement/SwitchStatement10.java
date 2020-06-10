package operatorsandstatements.switchstatement;

public class SwitchStatement10 {
    public static void main(String[] args) {
        final char a='A', d='D';
        char grade='B';
        switch (grade){
            case a:                                     //final char a
            case 'B':                                   //char grade='B'
                System.out.println("great");
            case 'C':                                   //char grade='C'
                System.out.println("good");break;
            case d:                                     //final char d
            case 'F':                                   //char grade='F'
                System.out.println("not good");
        }
    }
}
