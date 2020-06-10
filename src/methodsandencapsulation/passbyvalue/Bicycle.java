package methodsandencapsulation.passbyvalue;

public class Bicycle {
    String color="red";
    private void printColor(String color){
        //this.color=color;
        color="purple";
        System.out.println(color);
    }

    public static void main(String[] args) {
        new Bicycle().printColor("blue");
    }
}
