package classdesign.abstraction3;

public class Example {
    public static final String schoolName;
    // Final variables can not be assigned. They are constant
    // Once we create an Object, static block, Constructor and instance block will be run

    static {
        schoolName="Techtorial";
    }
    {
        //schoolName="Techtorial";        // can not be reassigned that is why it is complaining
    }
    public Example(){
        //schoolName="Techtorial";          //
    }

    public static void main(String[] args) {
        String newName=schoolName+2;
        System.out.println(newName);
    }
}
