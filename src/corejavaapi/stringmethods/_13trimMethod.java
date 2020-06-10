package corejavaapi.stringmethods;

public class _13trimMethod {
    public void trimMethod(){
        String start="Animal    ";
        String trimmed=start.trim();
        System.out.println(trimmed);
        String str="   abc abc abc    ";
        String trimmed1=str.trim();
        System.out.println(trimmed1);

    }

    public static void main(String[] args) {
        _13trimMethod trim=new _13trimMethod();
        trim.trimMethod();
    }
}
