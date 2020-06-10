package corejavaapi.stringbuilder;

public class StringBuilder5 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("20120");

        System.out.println("20120".charAt(2));

        StringBuilder alp=new StringBuilder();
        // a,b,c,......z
        for (char i='a';i<'z';i++){
            alp.append(i);
            System.out.println(alp);
        }

    }
}
