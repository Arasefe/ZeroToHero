package corejavaapi.stringpractice;

public class SubstringPractice {
    public static void main(String[] args) {
        String comComponent="keyboard";
        System.out.println(comComponent.substring(3));      // board
        System.out.println(comComponent.substring(3,5));    // 3,4
        System.out.println(comComponent.substring(1,2));    // 1---->e
        System.out.println(comComponent.substring(2,2));    // it will print empty
        System.out.println(comComponent.substring(4,2));    // it will give exception
        System.out.println(comComponent.substring(4,20));   // out of bound exception
        System.out.println(comComponent.substring(4,8));    // oard



    }
}
