package classdesign.abstraction1;

public abstract class Student {
    int studentID;
    String studentName;

    public void study(){
        System.out.println("Student is studying");
    }
    public abstract void attendClass();             //abstract method syntax

    abstract Boolean isActive();

    // abstract method

}
