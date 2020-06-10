package classdesign.inheritance3;


public class IT extends Company {
    public IT(String name){
        super(name);
    }
    @Override
    public Boolean isHiring(){

        return true;
    }
    public void SDET(){
        System.out.println("SDET is testing the application");
    }
}
