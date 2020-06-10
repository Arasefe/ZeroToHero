package buildingblocks.variables;

public class StaticVariables2 {
    static int wheels=1;
    int tracks=5;

    public static void main(String[] args) {
        StaticVariables2 s=new StaticVariables2();
        int feet=4,tracks=15;
        System.out.println(feet+tracks+s.wheels);
    }
}
