package corejavaapi.stringbuilder;

public class StringBuilder4 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(char current='a';current<='z';current++){
            builder.append(current);
        }
        System.out.println(builder);
    }
}
