package methodsandencapsulation.constructors;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("Ismail",007);
        Student s2=new Student("Baha",8);
        Student s3=new Student ("Lamiya",9);
        Student s4=new Student("Bermet",10);

        //s1.schoolName="Techtorial";
        System.out.println(s3.schoolName);
        Student.schoolName="MIDDLE EAST TECHNICAL UNIVERSITY";
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
        System.out.println(s4.schoolName);

        System.out.println("++++++++++++++++");



    }

}
