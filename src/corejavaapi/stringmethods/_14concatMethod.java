package corejavaapi.stringmethods;

public class _14concatMethod {
    public static void main(String[] args) {
        String s="SALDIRI" + " "+"ANI";
        System.out.println(s);
        String s1=50+30+"SALDIRI"+40+40;
        System.out.println("s1 is"+" "+ s1); // 80SALDIRI40 40
        String s2="NEW";
        String s3="LIFE";
        String s4=s2.concat(s3);
        System.out.println("s4 is "+" " +s4);
        String s5="WORLD";
        String s6="ORDER";
        String s7=s5.concat(s6);
        System.out.println("s7 is"+" "+ s7);
        String s8= 40+20+" NEW WORLD ORDER"+" "+20+30+40;
        System.out.println("s8 is"+ " "+s8);
        alternate();
    }
    public static void alternate(){
        String str1="Java string";
        String str2=" is immutable";
        System.out.println(str1.concat(str2));
        String str3=" so assign it explicitly";
        System.out.println(str1.concat(str2).concat(str3));


    }
}
