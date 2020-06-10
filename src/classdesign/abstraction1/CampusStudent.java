package classdesign.abstraction1;

public class CampusStudent extends Student{

    // implement override

    @Override
    public void attendClass(){
        System.out.println("Student attending the class from campus");


    }
    @Override
    public Boolean isActive(){
        return true;
    }
    @Override
    public void study(){
        System.out.println("Campus student is studying");
    }
}
