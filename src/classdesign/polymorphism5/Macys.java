package classdesign.polymorphism5;


public class Macys extends Store {
    String name="Macy's";
    @Override
    public void sellClothes(){
        System.out.println("Selling Clothes from"+name);
    }
    public static void staticMethod(){
        System.out.println("Macy's class static method");
    }

    @Override
    public String toString(){
        return name+" is located in Chicago";
    }

    public static void main(String[] args) {
//        Macys macys=new Macys();
//        macys.sellClothes();
//        System.out.println(macys.name);//Macy's
//        macys.staticMethod();
//
//        // Reference side decides which variables and method to call
//        Store store=new Store();
//        System.out.println(store.name);
//        store.staticMethod();
//        // Reference side decides to call the variables
//        Store store1=new Macys();
//        System.out.println(store1.name);
//        store1.sellClothes();       //last overridden method from Macy's
//        store1.staticMethod();
//
//        Object store2=new Macys();
//        System.out.println(store2.toString());
//
//        Object store3=new Store();
//        System.out.println(store3.toString());
          Store store=new Store();
          store.sellClothes();
          Store store1=new Macys();
          store1.sellClothes();                     //Runtime polymorphism=Dynamic Binding
    }
}
