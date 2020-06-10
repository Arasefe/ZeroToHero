package corejavaapi.stringmethods;

import org.w3c.dom.ls.LSOutput;

public class _11containsMethod {
    public static void main(String[] args) {
        String s= "Yurtta sulh, cihanda sulh!";
        System.out.println(s.contains("sulh"));    // true
        System.out.println(s.contains("Yurt"));    // true
        System.out.println(s.contains("U"));       // false

        String str="Ne mutlu Turkum Diyene";
        System.out.println(str.contains("N"));
        System.out.println(str.contains("MU"));
        System.out.println(str.contains("lu"));
        System.out.println(str.contains("Turk"));
        System.out.println(str.contains("kum"));
        System.out.println(str.contains("iyen"));

    }
}
