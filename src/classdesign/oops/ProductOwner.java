package classdesign.oops;

public class ProductOwner extends ScrumTeam {

    String projectName;
    String teamName;
    int salary;

    @Override
    public void progress(){
        System.out.println("The projectTeam is working");
    }
    @Override
    public void work(){
        System.out.println("The project team is working");
    }
    @Override
    public void sprintNumber(){
        System.out.println("The project is in sprint nu");
    }

    public ProductOwner(String projectName, String teamName){
        super(projectName,teamName);

    }
    public ProductOwner(String projectName, String teamName, int salary){
        this(projectName,teamName);
        this.salary=salary;
    }
}
