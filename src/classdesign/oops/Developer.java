package classdesign.oops;

public class Developer extends ScrumTeam {
    String projectName;
    String teamName;
    int salary;

    @Override
    public void progress(){
        System.out.println(super.projectName+"is in the progress");
    }
    @Override
    public void work(){
        System.out.println(super.teamName+ " is working");
    }
    @Override
    public void sprintNumber(){
        System.out.println("The project is in sprint nu");
    }

    public Developer(String projectName, String teamName){
        super(projectName,teamName);

    }

    public Developer(String projectName, String teamName, int salary){
        this(projectName,teamName);
        this.salary=salary;
    }
}
