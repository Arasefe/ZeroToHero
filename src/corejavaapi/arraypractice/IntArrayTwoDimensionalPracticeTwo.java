package corejavaapi.arraypractice;

public class IntArrayTwoDimensionalPracticeTwo {
    public static void main(String[] args) {
        /*
        Create two dimensional array to store the price for grocery products.
        Fruits-->Watermelon (1,99)-10, apple (1,49)-100, banana (0,48)-150.
        Vegetables-->beans (1)-200,lettuce(0,99)-100,cabbage (2,99)-110,onion (1,99)-200,potato (0,69)-250,cucumber(1)-50.
        Drinks--->Orange Juice (3,99)-80, Pepsi(1)-230, Water(4)-49, lemonade (5)-95
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
        int [][]inventory= {
                {10, 100, 150},
                {200, 100, 110, 200, 250, 50},
                {80, 230, 49, 95}
        };

        for (int i=0;i<products.length;i++){
            for (int k=0;k<products[i].length;k++){
                System.out.println("The product name is " + products[i][k]+ "price is "+ prices[i][k]+"inventory number is"+ inventory[i][k]);
            }



        }

    }
}
