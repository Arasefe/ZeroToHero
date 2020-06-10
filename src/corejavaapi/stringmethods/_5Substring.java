package corejavaapi.stringmethods;

public class _5Substring {
    public static void main(String[] args) {
        String s="Never give up";
        System.out.println(s.substring(6)); // give up
        System.out.println(s.substring(0,5));// Never
        alternate();
    }
    public static void alternate(){
        String s="Ordular ilk hedefiniz Akdeniz, ileri!";
        System.out.println(s.substring(8)); // ilk hedefiniz Akdeniz, ileri!
        System.out.println(s.substring(12,21)); // hedefiniz
        String s1="Ya istiklal ya olum!";
        System.out.println(s1.substring(3)); //istiklal ya olum!
        System.out.println(s1.substring(3,11)); //istiklal
        System.out.println(s1.substring(12,20)); //ya olum!
        String s2= "Kahpeler dunyaya hukumdar olmaz!";
        System.out.println(s2.substring(17)); //hukumdar olmaz!

    }
}
