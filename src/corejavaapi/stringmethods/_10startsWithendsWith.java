package corejavaapi.stringmethods;

public class _10startsWithendsWith {
    public static void main(String[] args) {
        String s="Never";
        System.out.println(s.startsWith("n"));    // false
        System.out.println(s.endsWith("r"));      // true
        System.out.println(s.endsWith("ver"));    // true
        System.out.println(s.endsWith("er"));     // true
        System.out.println(s.endsWith("R"));      // false
        System.out.println(s.startsWith("Neve")); // true


    }
}
