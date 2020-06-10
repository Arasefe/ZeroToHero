package classdesign.abstraction1;

public class Teacher extends OnlineStudent {
    @Override

    public void attendClass(){

        System.out.println("Teacher is teaching class");

    }
    @Override
    public Boolean isActive(){

        return true;
    }
}
