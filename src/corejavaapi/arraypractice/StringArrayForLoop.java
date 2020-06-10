package corejavaapi.arraypractice;

public class StringArrayForLoop {
    public static void main(String[] args) {
        /*
        Create two dimensional array to store grocery product.
        Fruits-->Watermelon, apple, banana.
        Vegetables-->beans,lettuce,cabbage,onion,potato,cucumber.
        Drinks--->Orange Juice, Pepsi, Water, lemonade
        Using for loop print all the products

         */
        //groceries [0][0]-
        String [][]groceries={{"Watermelon","apple", "banana" },
                { "beans","lettuce","cabbage","onion","potato","cucumber"},
                {"Orange Juice", "Pepsi", "Water", "lemonade"}};
       for (int i=0; i<groceries.length;i++){
           for (int k=0;k<groceries[i].length;k++){
               System.out.println("The product name is " + groceries[i][k]);
           }
       }
    }
}
