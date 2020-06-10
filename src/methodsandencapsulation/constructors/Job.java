package methodsandencapsulation.constructors;

public class Job {
    String jobTitle;
    double salary;
    String location;
    String country="USA";

    public Job(){           // To initialize variables

    }
    public Job(String jobTitle){

        this.jobTitle=jobTitle;
    }
    public Job(String jobTitle, double salary){
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public Job(String jobTitle, double salary,String location){
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.location=location;
    }
    public Job(String jobTitle, double salary,String location,boolean openToRelocate ){
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.location=location;

    }
    public void getDetails(){
       // String jobTitle="Developer"; just as an example
        System.out.println(jobTitle+"\n"+salary+"\n"+location);
}


}
