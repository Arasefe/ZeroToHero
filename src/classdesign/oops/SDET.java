package classdesign.oops;

public class SDET extends ScrumTeam {
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
        System.out.println("The project is in sprint ");
    }

    public SDET(String projectName, String teamName){
        super(projectName,teamName);

    }
    public SDET(String projectName, String teamName, int salary){
        this(projectName,teamName);
        this.salary=salary;
    }
}
