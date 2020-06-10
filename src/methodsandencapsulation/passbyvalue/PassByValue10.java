package methodsandencapsulation.passbyvalue;

public class PassByValue10 {
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);      //2
        System.out.println(b);      //1
    }

    public static void main(String[] args) {
        int original1=1;
        int original2=2;
        swap(original1,original2);

    }
}
