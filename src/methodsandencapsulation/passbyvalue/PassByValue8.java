package methodsandencapsulation.passbyvalue;

public class PassByValue8 {
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int original1=1;
        int original2=2;
        swap(original1,original2);
//        System.out.println(original1);
//        System.out.println(original2);
    }
}
