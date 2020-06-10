package corejavaapi.arraypractice;

public class IntArrayTwoDimensionalPracticeOne {
    public static void main(String[] args) {
         /*
        Create two dimensional array to store the price for grocery products.
        Fruits-->Watermelon (1,99), apple (1,49), banana (0,48).
        Vegetables-->beans (1),lettuce(0,99),cabbage (2,99),onion (1,99),potato (0,69),cucumber(1).
        Drinks--->Orange Juice (3,99), Pepsi(1), Water(4), lemonade (5)
        Print all the product name and price with following order
        The product name is watermelon and the price is 1,99,
        The product name is apple and the price is 1,49,
          */

        String [][]products={
                {"Watermelon","apple", "banana" },
                { "beans","lettuce","cabbage","onion","potato","cucumber"},
                {"Orange Juice", "Pepsi", "Water", "lemonade"}};

            double [][]prices={
                    {1.99,1.49,0.48},
                    { 1,0.99,2.99,1.49,0.69,0.48},
                    {3.99,1,4,5}};

            for (int i=0;i<products.length;i++){
                for (int k=0;k<products[i].length;k++){
                    System.out.println("The product name is " +products[i][k] +"and the price is "+ prices[i][k]);
                }
            }

    }
}
