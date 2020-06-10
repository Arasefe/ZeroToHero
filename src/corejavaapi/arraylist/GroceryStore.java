package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
        /**
         * Create class that automatically add values to shopping list.
         * and will welcome to GroceryStore message with items that needs to be bought from store.
         * Methods:
         * buy (String item) --->this method has to remove specific item from your shoppingList
         * return (String item)--->has to add that specific item back to shoppingList
         * car()---->once called, print "Heading to Grocery Store"
         * isOpen()---->has to print true if store is open, else false.
         */
        static int time;
        static List<String> shoppingList=new ArrayList();           // in order to use shoppingList it has to be static as well
        static {
            shoppingList.add("Bread");
            shoppingList.add("Milk");
            shoppingList.add("Cereal");
            shoppingList.add("Patato");
            shoppingList.add("Oil");

            System.out.println("Welcome to GroceryStore!");
            System.out.println("_________________________");
            System.out.println(shoppingList);

        }
        public static void buy(String item){
            shoppingList.remove(item);
        }
        public static void returnItem(String item){
            shoppingList.add(0,item);               // we add our item to the first number of the shopping List
        }
        public static void car(){
            System.out.println("Heading to GroceryStore");
        }
        public GroceryStore(int time){                  // This is Constructor and has the same name of Class and no return type
            this.time=time;

        }
        public static boolean isOpen(){
            if (time >=9 &&time<=21){
                return true;

            }else{
                return false;
            }
        }
    }