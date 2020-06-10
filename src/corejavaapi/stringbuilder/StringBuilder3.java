package corejavaapi.stringbuilder;

public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder strBuilder=new StringBuilder("Techtorial");
       strBuilder.append(2019).append(true);
        // IF YOU WANT TO DO METHOD CHAINING RETURN TYPE OF METHOD MUST BE StringBuilder
        // return type of append is String Builder
        System.out.println(strBuilder);
        strBuilder=strBuilder.append("will be my year");

        System.out.println(strBuilder);
    }
}
