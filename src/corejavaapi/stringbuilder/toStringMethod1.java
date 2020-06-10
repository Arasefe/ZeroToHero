package corejavaapi.stringbuilder;

public class toStringMethod1 {
    public static void auxilaryToString(){
        StringBuilder sb=new StringBuilder("Never give up");
        //sb.toString();
        System.out.println("This is the String "+sb.toString());

    }

    public static void main(String[] args) {
        auxilaryToString();
    }
}
