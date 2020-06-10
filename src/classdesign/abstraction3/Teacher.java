package classdesign.abstraction3;

public class Teacher {
    final String TEACHERNAME;       //final variables are written capital letter as good common method of coding

static{
    System.out.println("I am static block of Teacher class");
}

    {
        System.out.println("I am instance block of Teacher class");
    }

    public Teacher(String teacherName){
    this.TEACHERNAME=teacherName;
        System.out.println("I am constructor of Teacher class");
    }

}
