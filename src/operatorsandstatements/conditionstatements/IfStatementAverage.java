package operatorsandstatements.conditionstatements;

public class IfStatementAverage {
    public static void main(String[] args) {
        int x=50;
        int y=60;
        int z=70;
        int average=(x+y+z)/3;
        if (average>=80){
            System.out.println("A");
        }
        else if (average<80 && average>=70){
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}
