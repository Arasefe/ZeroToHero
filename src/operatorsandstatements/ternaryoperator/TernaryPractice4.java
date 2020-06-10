package operatorsandstatements.ternaryoperator;

public class TernaryPractice4 {
    public static void main(String[] args) {
        int y=10;
        //int x;
        System.out.println((y>5)?21:"Zebra");
        System.out.println("===========================");
        ternary();
    }
     private static void ternary(){      // private access modifier can be accessed within the same class
        int y=10;
        String animal;
        animal=(y<20)?"Horse":"Tiger";
        System.out.println(animal);
    }

}
