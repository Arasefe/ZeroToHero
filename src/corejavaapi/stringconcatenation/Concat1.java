package corejavaapi.stringconcatenation;

public class Concat1 {
    public void concatMethod(){
        String name="Ismail";
        String lastName="YILDIRIM";
        System.out.println(name+ " "+lastName);      //IsmailYILDIRIM
        StringBuilder sb=new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);

    }

    public static void main(String[] args) {
        Concat1 ct=new Concat1();
        ct.concatMethod();
    }
}
