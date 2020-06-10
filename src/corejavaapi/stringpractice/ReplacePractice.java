package corejavaapi.stringpractice;

public class ReplacePractice {
    public static void main(String[] args) {
        String str= "indexOutOftheBoundException";
        str=str.replace('i','L');
        System.out.println(str);
        // DB jdk-13.0.1
        String db="jdk 13.0.1";
        String java="jdk-13.0.1";  //UI
        java=java.replace("-","");
        System.out.println("The verification " + db.equals(java));
        System.out.println(java);

        java.replace("p","s");  // there will be no replace as there is no p.

    }
}
