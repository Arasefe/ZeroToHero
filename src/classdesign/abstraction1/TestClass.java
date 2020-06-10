package classdesign.abstraction1;

public class TestClass {
    public static void main(String[] args) {
        //   Student student=new Student();
        //   can not be instantiated as Student class is Abstract class

        CampusStudent campusStudent=new CampusStudent();
        campusStudent.attendClass();
    }
}
