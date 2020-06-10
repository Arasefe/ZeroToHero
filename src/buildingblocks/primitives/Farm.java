package buildingblocks.primitives;

public class Farm {
    public static void main(String[]args){
        int numberCows=43;
        int numberChickens=110;
        int totalNumberAnimals= numberCows+numberChickens;
        int numberLegsCows=4;
        int numberLegsChickens=2;
        int totalNumberLegs=numberCows*numberLegsCows+ numberChickens*numberLegsChickens;
        int cowPrice=2000;
        int ChickenPrice=55;
        int totalPrice=cowPrice*numberCows+numberChickens*ChickenPrice;

        System.out.println("This is my total number of animals " + totalNumberAnimals);
        System.out.println("This is my total number of legs " + totalNumberLegs);
        System.out.println(" Animals' total worth is $ " + totalPrice);


        char letter=2442;
        System.out.println(letter);
        int weirdChar='ঊ';
        System.out.println(weirdChar);




    }
}
