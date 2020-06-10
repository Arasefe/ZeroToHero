package classdesign.inheritance3;

public class Test {
    public static void main(String[] args) {
        HR hr=new HR("Google");
        System.out.println(hr.isHiring());
        System.out.println(hr.companyName);
        IT it = new IT("Google");
        System.out.println(it.progress());


    }
}
