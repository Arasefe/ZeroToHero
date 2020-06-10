package classdesign.oops;



public abstract class ScrumTeam {
    String teamName;
    String projectName;

    public ScrumTeam(String teamName,String projectName){

        this.teamName=teamName;
        this.projectName=projectName;
    }

    public abstract void progress();

    public abstract void work();

    public abstract void sprintNumber();

}
