package corejavaapi.arraypreperation;

public class ArrayPractice8 {
    public static boolean arrayMethod(){
        String []bugs={"cricket","beetle","ladybug"};
        String []alias=bugs;
        System.out.println(bugs.equals(alias));  //true as alias is assigned to bugs and both referencing the same object
        return bugs.equals(alias);
    }

    public static void main(String[] args) {
        arrayMethod();
    }
}
