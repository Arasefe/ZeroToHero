package methodsandencapsulation.passbyvalue;

public class PassByValue5 {
    public static void newNumber(int num){
        int result=num*2;
        System.out.println("newNumber num: "+result);

    }

    public static void main(String[] args) {

        newNumber(4);
       // System.out.println("main method number:"+num);
    }
}
