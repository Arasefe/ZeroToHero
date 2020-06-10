package corejavaapi.stringmethods;

public class _15MethodChaining {
    public static void methodChain(){
        String start="Animal     ";
        String trimmed=start.trim().toLowerCase().toUpperCase().replace('A','3');    //

        System.out.println(trimmed);

    }

    public static void main(String[] args) {
        methodChain();
    }
}
