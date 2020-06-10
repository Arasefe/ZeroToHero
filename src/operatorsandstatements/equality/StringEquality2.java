package operatorsandstatements.equality;

public class StringEquality2 {
    public static void methodStringEquality(String str2){
       String str1=new String("Casablanca");
       if (str1.equals(str2)){
           System.out.println("Checks if the value of both Strings are the same "+ true);

        }
        if (!str1.equals(str2)){
            System.out.println("Checks if the value of both Strings are the same "+ false);

        }

    }

    public static void main(String[] args) {
        methodStringEquality("main");
    }
}
