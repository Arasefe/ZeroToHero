package classdesign.inheritance3;

public class Company extends Object {

    String companyName;
    public Company(){
        super();

    }
    public Company(String name){
        this();
        this.companyName=name;
    }
    Boolean isHiring(){
        return false;
    }
    protected Object progress(){

        return "is the middle of the project";
    }
}
