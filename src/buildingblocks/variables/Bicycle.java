package buildingblocks.variables;

public class Bicycle {
    String color="red";
    private void printColor(String color){
        color="purple";
        System.out.println(color);
    }

    public static void main(String[] args) {
        new Bicycle().printColor("blue");
        System.out.println(new Bicycle() instanceof Bicycle);           //usage of instance of
    }
}
