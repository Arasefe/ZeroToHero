package corejavaapi.stringbuilder;

public class StringBuilderDelete {
    public void deleteMethod(){
        StringBuilder sb=new StringBuilder("abcdefgh");
        sb.delete(1,3);                     //adefgh
        System.out.println(sb);
        System.out.println("++++++++++++++++++++++++++");
        sb.deleteCharAt(0);                 //defgh
        System.out.println(sb);
        //sb.deleteCharAt(6);                 // throws and exception
    }

    public static void main(String[] args) {
        StringBuilderDelete dl=new StringBuilderDelete();
        dl.deleteMethod();
    }
}
