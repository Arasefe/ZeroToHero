package operatorsandstatements.equality;

public class StringEquality1 {
    public static void methodStringEquality(String str1, String str2){
        if(str1==str2){
            System.out.println("They are pointing the same location "+ true);
        }
        if (str1!=str2){
            System.out.println("They are pointing the same location "+false);
        }

    }

    public static void main(String[] args) {
        methodStringEquality("car","var");
    }
}
