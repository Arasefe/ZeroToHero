package methodsandencapsulation.passbyvalue;

public class PassByValue3 {
    public static int updateInt(int number){
        number=(number*5)/3+21;
        return number;
    }

    public static void main(String[] args) {
        updateInt(3);
        System.out.println(updateInt(3));

    }
}
