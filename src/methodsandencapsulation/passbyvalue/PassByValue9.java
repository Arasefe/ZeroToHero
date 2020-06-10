package methodsandencapsulation.passbyvalue;

public class PassByValue9 {
    public static int number(int number){
        number++;
        return number;                                  //2

    }
    public static String letters(String letters){
        letters+="d";
        return letters;                                 //abcd
    }

    public static void main(String[] args) {
        int number=1;                                   //1
        String letters="abc";                           //abc
        number(number);                                 //1
        letters=letters(letters);                       //abcd
        System.out.println(number+letters);             //1abcd
    }
}
