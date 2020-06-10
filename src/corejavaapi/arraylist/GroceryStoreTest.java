package corejavaapi.arraylist;

public class GroceryStoreTest {
    public static void main(String[] args) {
        GroceryStore groceryStore=new GroceryStore(14);     // This Object will terminate the Constructor with no reference.
        System.out.println(groceryStore.isOpen());
        groceryStore.car();
        groceryStore.buy("Oil");
        System.out.println(groceryStore.shoppingList);
        groceryStore.buy("Potato");
        System.out.println(groceryStore.shoppingList);
        groceryStore.buy("Milk");
        System.out.println(groceryStore.shoppingList);
        groceryStore.returnItem("Milk");
        System.out.println(groceryStore.shoppingList);
        groceryStore.returnItem("oil");
        System.out.println(groceryStore.shoppingList);
        groceryStore.returnItem("Coffee");
        System.out.println(groceryStore.shoppingList);


    }
}
