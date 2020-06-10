package classdesign.abstraction3;

public class Programmer extends Teacher {

    public Programmer(String teacherName){
        super(teacherName);
        System.out.println("I am constructor of Programmer class");
    }
    static{
        System.out.println("I am static block of Programmer class");
    }
    {
        System.out.println("I am the instance block of Programmer class");
    }

    public static void main(String[] args) {
        Programmer programmer=new Programmer("John");
        Programmer programmer1=new Programmer("Doe");

    }

}
