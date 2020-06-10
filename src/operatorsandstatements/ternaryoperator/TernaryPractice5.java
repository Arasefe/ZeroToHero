package operatorsandstatements.ternaryoperator;

public class TernaryPractice5 {
    public static void main(String[] args) {
        int a=5;

        System.out.println((a>5)?true:false);
        System.out.println("_______________________");
        ternary();
    }
    private static void ternary(){
        int a=4;
        int b=6;
        String son= a<b?"Tulpar":"Aras";
        System.out.println(son);
    }
}
