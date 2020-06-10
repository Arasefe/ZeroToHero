package operatorsandstatements.equality;

public class StringEquality5 {
    public static void main(String[] args) {
        String bob=new String("bob");
        String notbob="bob";
        System.out.println((bob==notbob)+""+(bob.equals(notbob)));
    }
}
