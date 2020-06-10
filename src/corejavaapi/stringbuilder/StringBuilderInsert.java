package corejavaapi.stringbuilder;

public class StringBuilderInsert {
    public static void stringBuilderMethod(){
        StringBuilder sb=new StringBuilder("Animals");
        // sb="Animals"; DOES NOT COMPILE
        sb.insert(7,"-");           //Animals-
        sb.insert(0,"-");           //-Animals-
        sb.insert(4,"-");           //-Ani-mals-
        System.out.println(sb);

    }

    public static void main(String[] args) {
        stringBuilderMethod();
    }
}
