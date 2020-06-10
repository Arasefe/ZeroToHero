package classdesign.oops;

public class ScrumMaster extends ScrumTeam {
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

    public ScrumMaster(String projectName, String teamName){
        super(projectName,teamName);

    }
    public ScrumMaster(String projectName, String teamName, int salary){
        this(projectName,teamName);
        this.salary=salary;
    }

}
