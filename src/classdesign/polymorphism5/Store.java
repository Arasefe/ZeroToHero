package classdesign.polymorphism5;

public class Store {
    String name= "classdesign/polymorphism5";

    public void sellClothes(){
        System.out.println("Selling the Clothes from "+ name);      //by default this.name if want to change to super class super.name;
    }
    public static void staticMethod(){
        System.out.println("Store class static method");
    }
}
