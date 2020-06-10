package corejavaapi.stringbuilder;

public class StringBuilder10 {
    public static void stringMethod(){
        String alpha="";
        for(char current='a';current<='z';current++){
            alpha+=current;
            System.out.println(alpha);
        }
    }
    public static void stringBuilderMethod(){
        StringBuilder alpha=new StringBuilder();
        for(char current='a';current<='z';current++){
            alpha.append(current);
            System.out.println(alpha);
        }

    }

    public static void main(String[] args) {
        stringBuilderMethod();
    }
}
