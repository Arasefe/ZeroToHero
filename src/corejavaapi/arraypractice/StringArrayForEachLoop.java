package corejavaapi.arraypractice;

public class StringArrayForEachLoop {
    public static void main(String[] args) {
        /*
        Create two dimentional array to store grocery product.
        Fruits-->Watermelon, apple, banana.
        Vegetables-->beans,lettuce,cabbage,onion,potato,cucumber.
        Drinks--->Orange Juice, Pepsi, Water, lemonade
        Using for loop print all the products

         */
        String [][]groceries={
                {"Watermelon","apple", "banana" },
                { "beans","lettuce","cabbage","onion","potato","cucumber"},
                {"Orange Juice", "Pepsi", "Water", "lemonade"}};
        for (String[] grocery:groceries){
            for (String str:grocery){
               System.out.println(str);
            }
        }
    }
}
