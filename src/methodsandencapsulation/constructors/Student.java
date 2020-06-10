package methodsandencapsulation.constructors;

public class Student {
    String name;            // if we create static String name; it will take the last name as the static name
    int studentId;
    static String schoolName;

    static{                  // static block runs once at the beginning
        schoolName.equals("Techtorial");
    }
    {
        name="John";    //instance block accepts static variables and non-static variables
        schoolName="Techtorial2";
    }





    public Student (String name, int studentId){        //constructor
        this.name=name;
        this.studentId=studentId;
    }

    public void study(){                                // method overloading
        System.out.println(name+ "is studying.");
    }
    public void study (int studyHour){                  // method overloading
        System.out.println(name+"is studying for"+studyHour+"hours.");
    }
    public void study (String name,int studyHour){
        System.out.println(name+"is studying for "+ studyHour+"hours.");
    }
}
