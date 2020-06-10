package corejavaapi.stringbuilder;

public class toStringMethod3 {
    public static String method(StringBuilder stringBuilder){
      String str=stringBuilder.toString();
        System.out.println(str);

      return str;
    }

    public static void main(String[] args) {
        method(new StringBuilder("No matter how big obstacles i face, i will succeed."));
    }
}
