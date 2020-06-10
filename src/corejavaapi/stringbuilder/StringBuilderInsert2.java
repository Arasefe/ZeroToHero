package corejavaapi.stringbuilder;

public class StringBuilderInsert2 {
    public static void insert(){
        StringBuilder success=new StringBuilder();
        success.append("Preparation");
        success.insert(0,"$");
        System.out.println(success);



        success.insert(11,"_");
        System.out.println(success);

        System.out.println(success.length());
        success.insert(13,"$");
    }

    public static void main(String[] args) {
        insert();
    }
}
